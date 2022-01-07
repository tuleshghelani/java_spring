package com.tulesh.hibernate.demo.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="hb_04_one_to_many_uni.course")
public class Course {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name="title")
    private String title;

    @ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE
        ,CascadeType.DETACH,CascadeType.REFRESH})
    @JoinColumn(name = "instructor_id")
    private Instructor instructor;

    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "course_id")
    private List<Review> reviews;

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {CascadeType.PERSIST,CascadeType.MERGE
            ,CascadeType.DETACH,CascadeType.REFRESH})
    @JoinTable(
            name = "course_student",
            joinColumns = @JoinColumn(name="course_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id")
    )
    private List<Student> students;


    public Course() {
    }

    public Course(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public Course setTitle(String title) {
        this.title = title;
        return this;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public Course setInstructor(Instructor instructor) {
        this.instructor = instructor;
        return this;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void addReview(Review theReview){
        if(reviews ==null){
            reviews =new ArrayList<>();
        }
        reviews.add(theReview);
    }

    public Course setReviews(List<Review> reviews) {
        this.reviews = reviews;
        return this;
    }

    public List<Student> getStudents() {
        return students;
    }

    public Course setStudents(List<Student> students) {
        this.students = students;
        return this;
    }

    public void addStudent(Student theStudent){
        if(students==null){
            students=new ArrayList<>();
        }
        students.add(theStudent);
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
