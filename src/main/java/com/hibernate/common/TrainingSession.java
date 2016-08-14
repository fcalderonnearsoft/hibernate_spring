package com.hibernate.common;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "training_session")
public class TrainingSession implements Serializable {

    private Integer id;
    private String title;
    private String description;
    private Integer classLocationId;
    private Course course;
    private ClassLocation classLocation;
    private Instructor instructor;
    private Enrollment enrollment;

    public TrainingSession() {
    }

    @Id
    @GeneratedValue
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    @Column(name = "class_location_id")
    public Integer getClassLocationId() {
        return classLocationId;
    }

    @OneToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    public Course getCourse() {
        return course;
    }

    @OneToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    public ClassLocation getClassLocation() {
        return classLocation;
    }

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "trainingSession", cascade = CascadeType.ALL)
    public Instructor getInstructor() {
        return instructor;
    }

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "trainingSession", cascade = CascadeType.ALL)
    public Enrollment getEnrollment() {
        return enrollment;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setClassLocationId(Integer classLocationId) {
        this.classLocationId = classLocationId;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setClassLocation(ClassLocation classLocation) {
        this.classLocation = classLocation;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public void setEnrollment(Enrollment enrollment) {
        this.enrollment = enrollment;
    }
}
