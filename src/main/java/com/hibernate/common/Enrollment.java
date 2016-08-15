package com.hibernate.common;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "enrollment")
public class Enrollment implements Serializable{

    private Integer id;
    private Boolean attended;
    private Integer trainingSessionId;
    private TrainingSession trainingSession;

    public Enrollment() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    @Column(name = "attended")
    public Boolean getAttended() {
        return attended;
    }

    @Column(name = "training_session_id")
    public Integer getTrainingSessionId() {
        return trainingSessionId;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    public TrainingSession getTrainingSession() {
        return trainingSession;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setAttended(Boolean attended) {
        this.attended = attended;
    }

    public void setTrainingSessionId(Integer trainingSessionId) {
        this.trainingSessionId = trainingSessionId;
    }

    public void setTrainingSession(TrainingSession trainingSession) {
        this.trainingSession = trainingSession;
    }
}
