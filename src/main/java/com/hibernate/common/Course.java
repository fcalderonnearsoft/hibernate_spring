package com.hibernate.common;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "course")
public class Course implements Serializable {

    private Integer id;
    private String title;
    private String description;
    private Integer durationInMinutes;
    private Integer teacherId;
    private Instructor instructor;
    private TrainingSession trainingSession;

    public Course() {
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
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

    @Column(name = "duration_in_minutes")
    public Integer getDurationInMinutes() {
        return durationInMinutes;
    }

    @Column(name = "teacher_id")
    public Integer getTeacherId() {
        return teacherId;
    }

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "course", cascade = CascadeType.ALL)
    public TrainingSession getTrainingSession() {
        return trainingSession;
    }

    public void setTrainingSession(TrainingSession trainingSession) {
        this.trainingSession = trainingSession;
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

    public void setDurationInMinutes(Integer durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }
}
