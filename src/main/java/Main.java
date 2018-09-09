import com.sda.hibernate.entity.Customer;
import com.sda.hibernate.entity.Store;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.HashSet;
import java.util.Set;

public class Main {

    private static final SessionFactory sessionFactory;

    static {
        try {
            Configuration configuration = new Configuration();
            configuration.configure();
            sessionFactory = configuration.buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);

        }
    }

    public static Session getSession() {
        return sessionFactory.openSession();
    }

    public static void main(String[] args) {

        Session session = getSession();
        Transaction tx = session.getTransaction();

        Store store = new Store((byte) 1, (byte) 1);
        Set<Customer> customers = new HashSet<Customer>();
        Customer customer = new Customer((byte) 1, (byte) 1);
        customers.add(customer);
        store.setCustomers(customers);

        tx.begin();
        tx.commit();
        session.close();


    }
}
