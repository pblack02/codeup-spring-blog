package edu.codeup.codeupspringblog.Models;


import jakarta.persistence.*;

@Entity
@Table(name= "dogs")
public class Dog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "int(11) UNSIGNED")
    private long id;

    @Column(columnDefinition = "tinyint(3) UNSIGNED", nullable = false, unique = true)
    private long age;

    @Column(length = 200, nullable = false)
    private String name;

    @Column(columnDefinition = "char(2) default 'XX'")
    private String resideState;


    public Dog() {
    }

    public Dog(long id, long age, String name, String resideState) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.resideState = resideState;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResideState() {
        return resideState;
    }

    public void setResideState(String resideState) {
        this.resideState = resideState;
    }
}
