import lk.ijse.gdse.aad.HibernateConfig;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class AppInitializer {
    public static void main(String[] args) {
        try {
            SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
            Session session = sessionFactory.openSession();
            System.out.println(session);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
