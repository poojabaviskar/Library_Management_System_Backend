package com.example.utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtility {
	/*
	private static SessionFactory sessionFactory;
	
	static {
		try {
			sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Session getSession() {
		return sessionFactory.openSession();
	}



private static SessionFactory sessionFactory;

static {
    try {
        sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    } catch (Throwable ex) {
        System.err.println("SessionFactory creation failed: " + ex);
        throw new ExceptionInInitializerError(ex);
    }
}

public static SessionFactory getSessionFactory() {
    return sessionFactory;
}
}

	    private static SessionFactory sessionFactory;

	    static {
	        try {
	            sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	        } catch (Throwable ex) {
	            System.err.println("SessionFactory creation failed: " + ex);
	            throw new ExceptionInInitializerError(ex);
	        }
	    }

	    // ✅ Add this method to return a session
	    public static Session getSession() {
	        return sessionFactory.openSession();
	    }

	    public static SessionFactory getSessionFactory() {
	        return sessionFactory;
	    }
	}
*/
	
	    private static SessionFactory sessionFactory;

	    static {
	        try {
	            // ✅ Explicitly loading hibernate.cfg.xml
	            sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	        } catch (Throwable ex) {
	            System.err.println("SessionFactory creation failed: " + ex);
	            throw new ExceptionInInitializerError(ex);
	        }
	    }

	    public static Session getSession() {
	        return sessionFactory.openSession();
	    }

	    public static SessionFactory getSessionFactory() {
	        return sessionFactory;
	    }
	}

