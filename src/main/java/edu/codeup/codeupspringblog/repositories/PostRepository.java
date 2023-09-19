package edu.codeup.codeupspringblog.repositories;

import edu.codeup.codeupspringblog.Models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {

}
