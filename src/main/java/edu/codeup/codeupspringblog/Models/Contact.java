package edu.codeup.codeupspringblog.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "contacts")
public class Contact {
    // for the primary id and auto increm.
    //Hibernate is the technology to empliment all the code.

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(columnDefinition = "int(11) UNSIGNED")
//    @Column(columnDefinition = "TEXT")
    // EX for Spring for desc.
//    @Column(length = 100, nullable = false)
    // column annotations for specification with your @column
    private long id;
    private String name;
    private String email;


    public Contact(){

    }

    public Contact(long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
