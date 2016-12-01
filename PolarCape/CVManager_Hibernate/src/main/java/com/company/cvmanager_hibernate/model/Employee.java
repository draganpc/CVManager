package com.company.cvmanager_hibernate.model;

import javax.persistence.*;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {

    @Id
    @GeneratedValue
    @Column(name = "EMPLOYEE_ID")
    private long id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "E-MAIL")
    private String email;

    @ManyToOne
    @JoinColumn(name = "SKILL_ID", nullable = false)
    private Skill skill;
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("First name: ").append(this.firstName).append(" last name: ");
        sb.append(lastName).append(" e-mail: ").append(email);
        sb.append(" skill: ").append(skill).append("\n");

        return sb.toString();
    }

    public Employee(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Skill getSkill() {
        return skill;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + (this.firstName != null ? this.firstName.hashCode() : 0);
        hash = 59 * hash + (this.lastName != null ? this.lastName.hashCode() : 0);
        hash = 59 * hash + (this.email != null ? this.email.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        if (this.id != other.id) {
            return false;
        }
        if ((this.firstName == null) ? (other.firstName != null) : !this.firstName.equals(other.firstName)) {
            return false;
        }
        if ((this.lastName == null) ? (other.lastName != null) : !this.lastName.equals(other.lastName)) {
            return false;
        }
        if ((this.email == null) ? (other.email != null) : !this.email.equals(other.email)) {
            return false;
        }
        if (this.skill != other.skill && (this.skill == null || !this.skill.equals(other.skill))) {
            return false;
        }
        return true;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

}
