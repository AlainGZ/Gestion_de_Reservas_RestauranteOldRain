
package com.oldrain.gestion_de_reservas_restauranteoldrain.modelo;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
/**
 * @author AlainGomez
 */

public class HibernateUtil {
    private static final SessionFactory sessionFactory;

    static {
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Error al crear SessionFactory: " + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}