
package utilitarios;

import com.sun.tools.ws.ant.AnnotationProcessingTask;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author Lenovo
 */
public class HibernateUtil {
private static final SessionFactory sessionFactory;

static{
    try{
        sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
    }catch (Throwable ex){
        System.out.println("Initial SessionFactory creation failed"+ex);
        throw new ExceptionInInitializerError(ex);
    }
}
public static SessionFactory getSessionFactory(){
    return sessionFactory;
}    
    
}

