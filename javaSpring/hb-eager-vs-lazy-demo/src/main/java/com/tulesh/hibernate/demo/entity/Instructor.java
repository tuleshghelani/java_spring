package com.tulesh.hibernate.demo.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "hb_03_one_to_many.instructor")
public class Instructor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "instructor_detail_id")
    private InstructorDetail instructorDetail;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "instructor",
            cascade ={CascadeType.PERSIST,CascadeType.MERGE
            ,CascadeType.DETACH,CascadeType.REFRESH})
    private List<Course>  courses;

    public Instructor() {
    }

    public Instructor(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", instructorDetail=" + instructorDetail +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public Instructor setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Instructor setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Instructor setEmail(String email) {
        this.email = email;
        return this;
    }

    public InstructorDetail getInstructorDetail() {
        return instructorDetail;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public Instructor setCourses(List<Course> courses) {
        this.courses = courses;
        return this;
    }

    public void add(Course tempcourse){
        if(courses==null){
            courses=new ArrayList<>();
        }

        courses.add(tempcourse);
        tempcourse.setInstructor(this);
    }

    public Instructor setInstructorDetail(InstructorDetail instructorDetail) {
        this.instructorDetail = instructorDetail;
        return this;
    }
}
