package com.tulesh.springdemosecond.mvc;

import com.tulesh.springdemosecond.mvc.validation.CourseCode;

import javax.validation.constraints.*;

public class Customer {
    private String firstName;

    @NotNull(message = "is required")
    @Size(min = 1, message = "is required minimum length 1")
    private String lastName;

    @NotNull(message = "is required")
    @Min(value = 0, message = "must be give greater than or equal to zero")
    @Max(value = 100, message = "must be less than 100")
    private Integer freePasses;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 chars or number")
    private String postalCode;

    @CourseCode(value = "ABC",message = "must start with ABC")
    private String courseCode;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public Customer setCourseCode(String courseCode) {
        this.courseCode = courseCode;
        return this;
    }
}
