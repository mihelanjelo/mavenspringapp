package hibernatetest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 * Created by mixan on 31.05.2017.
 */
public class App {

    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("Sasha");
        person.setLastName("Gray");
        SessionFactory sf = buildSessionFactory(Person.class);

        Session session = sf.openSession();

        session.save(person);
        Person savedPerson = session.get(Person.class, 1);


        System.out.println("________________________");
        System.out.println("First name - ".concat(savedPerson.getFirstName()));
        System.out.println("Last name - ".concat(savedPerson.getLastName()));
        System.out.println("________________________");

        sf.close();

    }

    private static SessionFactory buildSessionFactory(Class cls){
        return new Configuration().configure().addAnnotatedClass(cls).buildSessionFactory();
    }
}
