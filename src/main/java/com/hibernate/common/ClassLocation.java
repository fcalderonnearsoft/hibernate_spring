package com.hibernate.common;

import javax.persistence.*;

public class ClassLocation {
    private Integer id;
    private String name;
    private String email;
    private TrainingSession trainingSession;

    public ClassLocation() {
    }

    @Id
    @GeneratedValue
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "class_location", cascade = CascadeType.ALL)
    public TrainingSession getTrainingSession() {
        return trainingSession;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTrainingSession(TrainingSession trainingSession) {
        this.trainingSession = trainingSession;
    }
}
