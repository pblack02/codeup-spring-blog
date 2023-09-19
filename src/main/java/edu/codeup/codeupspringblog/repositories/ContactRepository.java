package edu.codeup.codeupspringblog.repositories;

import edu.codeup.codeupspringblog.Models.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContactRepository extends JpaRepository<Contact, Long> {


    // example of a derived query-- create the method with the right name and hibernate makes it happen--

    List<Contact> findAllByName(String name);




}
