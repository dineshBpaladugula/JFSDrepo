package com.Dinesh.AnnotationEx;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Dinesh.AnnotationEx.model.Employee;
public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Employee em = new Employee("suneetha","suneetha",2000);
        Session session=factory.openSession();
        Transaction tn=session.beginTransaction();
        session.save(em);
        tn.commit();
        session.close();
        factory.close();
    }
}
