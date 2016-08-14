package com.hibernate.common;

import javax.persistence.*;

public class Instructor {

    private Integer id;
    private Integer trainingSessionId;
    private Integer user_id;
    private TrainingSession trainingSession;
    private Course course;

    public Instructor() {
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setTrainingSession(TrainingSession trainingSession) {
        this.trainingSession = trainingSession;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public void setTrainingSessionId(Integer trainingSessionId) {
        this.trainingSessionId = trainingSessionId;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Id
    @GeneratedValue
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "instructor", cascade = CascadeType.ALL)
    public Course getCourse() {
        return course;
    }

    @Column(name = "training_session_id")
    public Integer getTrainingSessionId() {
        return trainingSessionId;
    }

    @Column(name = "user_id")
    public Integer getUser_id() {
        return user_id;
    }

    @OneToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    public TrainingSession getTrainingSession() {
        return trainingSession;
    }
}
