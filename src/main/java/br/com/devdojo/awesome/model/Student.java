package br.com.devdojo.awesome.model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;

/**
 * @author  Leonardo Sartori on 26/12/2018.
 */
@Entity
public class Student extends AbstractEntity{

    @NotEmpty(message = "The student name field is required")
    private String name;

    @NotEmpty(message = "The student email field is required")
    @Email(message = "Insert a valid email")
    private String email;

    private Boolean active;

    public Student() {

    }

    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Student(String name, String email, Boolean active) {
        this.name = name;
        this.email = email;
        this.active = active;
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

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", active=" + active +
                '}';
    }
}
