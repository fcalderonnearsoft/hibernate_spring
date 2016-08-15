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

        course.setDescription("HOLO");
        course.setTitle("HOLO");
        course.setTeacherId(4);
        course.setDurationInMinutes(10);



        App app = new App();

        app.insertInstructorWithCourse(course);
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