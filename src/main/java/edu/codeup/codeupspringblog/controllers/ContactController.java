package edu.codeup.codeupspringblog.controllers;

import edu.codeup.codeupspringblog.Models.Contact;
import edu.codeup.codeupspringblog.repositories.ContactRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ContactController {
    private ContactRepository contactsDao;

    // dependency injection: we don't have to create objects - just write code that knows how to create a new instance..

    public ContactController(ContactRepository contactsDao){
        this.contactsDao = contactsDao;
    }

    // just returning a json view...
    @GetMapping("/contacts")
    @ResponseBody
    public List<Contact> returnContacts(){
        return contactsDao.findAll();
    }

//    // view version of it
//    @GetMapping("/contacts/view")
//    public String returnContactsViw(Model model){
//        model.addAttribute("contacts", contactsDao.findAll());
//        return "contacts/index";
//    }


}
