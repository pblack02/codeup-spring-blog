package edu.codeup.codeupspringblog.controllers;


import edu.codeup.codeupspringblog.Models.Post;
import edu.codeup.codeupspringblog.repositories.PostRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PostController {

    private PostRepository postDao;

    public PostController (PostRepository postDao){
        this.postDao = postDao;
    }

//    @RequestMapping(path = "/posts", method = RequestMethod.GET)
//    @ResponseBody
//    public String index() {
//        return "Posts Index Page";
//    }

    @RequestMapping(path = "/posts/{id}", method = RequestMethod.GET)
    public String postId(@PathVariable long id, Model model) {
        if (postDao.existsById(id)) {
            Post post = postDao.findById(id).get();
            model.addAttribute("post", post);
            return "post/show";
        }
        return "redirect:/posts";
    }

    @RequestMapping(path = "/posts/create", method = RequestMethod.GET)
    public String getCreate() {
        return "posts/create";
    }

    @PostMapping("posts/create")
    public String createPost(Post post) {
        postDao.save(post);
        return "redirect:/posts";
    }

    @RequestMapping("/posts")
    public String listPosts(Model model) {
        List<Post> posts = postDao.findAll();
        model.addAttribute("posts", posts);
        return "index";
    }


}
