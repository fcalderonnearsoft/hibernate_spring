package com.hibernate.common;

import com.hibernate.persistence.HibernateUtil;
import org.hibernate.Session;

public class App {

    public static void main( String[] args )
    {
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        Course course = new Course();

        course.setDescription("pruba");
        course.setTitle("hoa");
        course.setId(22);
        course.setTeacherId(1);
        course.setDurationInMinutes(8);

        Instructor instructor = new Instructor();

        instructor.setId(1);
        instructor.setTrainingSessionId(8);
        instructor.setUser_id(7);

        course.setInstructor(instructor);
        instructor.getCourse().add(course);

        session.save(instructor);
        session.getTransaction().commit();


        session.beginTransaction();
        session.save(course);
        session.getTransaction().commit();

        session.close();
    }

    public void insertInstructorWithCourse(Course course){
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();

        session.save(course);
        session.flush();
        session.getTransaction().commit();

        session.close();
        HibernateUtil.getSessionFactory().close();
    }

    public void insertClassLocation(ClassLocation classLocation){

    }

}
