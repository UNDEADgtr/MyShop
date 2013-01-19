package by.undead.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

/**
 * Created with IntelliJ IDEA.
 * User: Dzmitry
 * Date: 19.01.13
 * Time: 22:38
 * To change this template use File | Settings | File Templates.
 */
public class HibernateUtil {

    private SessionFactory sf;

    private static HibernateUtil instance = new HibernateUtil();

    private final ThreadLocal sessions = new ThreadLocal();

    public HibernateUtil() throws ExceptionInInitializerError{
        try {
            Configuration config = new AnnotationConfiguration();
            config.setNamingStrategy(new MyNamingStrategy());
            this.sf = config.configure().buildSessionFactory();
        }  catch (Throwable ex){
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError();
        }
    }

    public static HibernateUtil getInstance(){
        return instance;
    }

    public Session getSession(){
        Session session = (Session) sessions.get();
        if(session==null){
            session = sf.openSession();
            sessions.set(session);
        }
        return session;
    }
}
