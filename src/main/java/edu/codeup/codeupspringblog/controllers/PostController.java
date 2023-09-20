package edu.codeup.codeupspringblog.controllers;


import edu.codeup.codeupspringblog.Models.Post;
import edu.codeup.codeupspringblog.Models.User;
import edu.codeup.codeupspringblog.repositories.PostRepository;
import edu.codeup.codeupspringblog.repositories.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PostController {

    private PostRepository postDao;
    private UserRepository userDao;
//
//    public PostController (UserRepository userDao){
//        this.userDao = userDao;
//    }

    public PostController (PostRepository postDao, UserRepository userDao){
        this.postDao = postDao;
        this.userDao = userDao;
    }

    @GetMapping("/post/index")
    public String indexPage(Model model){
        model.addAttribute("post", postDao.findAll());
        return "post/index";
    }


    @RequestMapping(path = "/posts/{id}", method = RequestMethod.GET)
    public String postId(@PathVariable long id, Model model) {
        if (postDao.existsById(id)) {
            Post post = postDao.findById(id).get();
            model.addAttribute("post", post);
            return "post/show";
        }
        return "redirect:/posts";
    }

    @GetMapping("/posts/{id}/edit")
    public String editPost(@PathVariable long id, Model model) {
        Post postToEdit = postDao.findById(id).get();
        model.addAttribute("post", postToEdit);
        return "posts/editPost";
    }
    @PostMapping("/posts/{id}/edit")
    public String insertEditPost(@ModelAttribute Post post, @PathVariable long id){
        Post postToEdit = postDao.findById(id).get();
        postToEdit.setTitle(post.getTitle());
        postToEdit.setBody(post.getBody());
        postDao.save(postToEdit);
        return "redirect:/posts";
    }

    @RequestMapping(path = "/posts/create", method = RequestMethod.GET)
    public String getCreate(Model model) {
        model.addAttribute("post", new Post());
        return "posts/create";
    }

    @PostMapping("posts/create")
    public String createPost(@ModelAttribute Post post) {
        User user = userDao.findById(1L).get();
        Post postToSave = new Post(
                post.getTitle(),
                post.getBody()
        );
        postDao.save(postToSave);
        return "redirect:/posts";
    }

    @RequestMapping("/posts")
    public String listPosts(Model model) {
        List<Post> posts = postDao.findAll();
        model.addAttribute("posts", posts);
        return "index";
    }




}
