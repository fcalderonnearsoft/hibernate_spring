package com.hibernate.common;

import javax.persistence.*;

@Entity
@Table(name = "course")
public class Course {

    private Integer id;
    private String title;
    private String description;
    private Integer durationInMinutes;
    private Integer teacherId;

    public Course() {
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

    @Column(name = "duration_in_minutes")
    public Integer getDurationInMinutes() {
        return durationInMinutes;
    }

    @Column(name = "teacher_id")
    public Integer getTeacherId() {
        return teacherId;
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
