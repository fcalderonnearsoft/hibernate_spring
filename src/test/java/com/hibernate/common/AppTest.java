package com.hibernate.common;

import com.hibernate.persistence.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testInsertInstructorWithCourse(){
        Course course = new Course();

        course.setDescription("cvv");
        course.setTitle("ad");
        course.setId(44);
        course.setTeacherId(1);
        course.setDurationInMinutes(10);

        Instructor instructor = new Instructor();

        instructor.setId(19);
        instructor.setTrainingSessionId(80);
        instructor.setUser_id(7);

        App app = new App();

        app.insertInstructorWithCourse(instructor, course);
//
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        Query query = session.createQuery("from Instructor where id = :id");
//        query.setParameter("id", 1);
//        List<Instructor> list = (List<Instructor>) query.list();
//        Instructor testInstructor = list.get(0);
//        assertEquals(testInstructor.getId(), instructor.getId());
//        assertEquals(testInstructor.getUser_id(), instructor.getUser_id());
    }
}