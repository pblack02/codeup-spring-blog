package edu.codeup.codeupspringblog.Models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "int(11)")
    private long id;

    @Column(length = 100, nullable = false)
    private String title;

    @Column(length = 225, nullable = false)
    private String body;

    @ManyToOne
    @JoinColumn(name ="user_id")
    private User user;


    public Post(String title, String body, User user) {
        this.title = title;
        this.body = body;
        this.user = user;
    }


    public Post(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
