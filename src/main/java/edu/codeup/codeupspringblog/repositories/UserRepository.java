package edu.codeup.codeupspringblog.repositories;

import edu.codeup.codeupspringblog.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
