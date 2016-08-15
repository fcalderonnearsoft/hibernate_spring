package com.hibernate.common;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "instructor")
public class Instructor implements Serializable{

    private Integer id;
    private Integer trainingSessionId;
    private Integer user_id;
    private TrainingSession trainingSession;
    private Set<Course> course = new HashSet<Course>();

    public Instructor() {
    }

    public Instructor(Integer id, Integer trainingSessionId, Integer user_id) {
        this.id = id;
        this.trainingSessionId = trainingSessionId;
        this.user_id = user_id;
    }

    public void setCourse(Set<Course> course) {
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
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "instructor")
    public Set<Course> getCourse() {
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
