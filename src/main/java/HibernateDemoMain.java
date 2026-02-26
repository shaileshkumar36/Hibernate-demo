// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import org.hibernate.Session;

public class HibernateDemoMain {
    public HibernateDemoMain() {
    }

    public static void main(String[] args) {
        Session session = HibernateUtil.getSession();

        try {
            UserClassHibernate user = new UserClassHibernate("Alice");
            session.beginTransaction();
            session.persist(user); // save(user);
            session.getTransaction().commit();
            System.out.println("User saved: " + String.valueOf(user.getId()));
        } catch (Exception var6) {
            var6.printStackTrace();
        } finally {
            HibernateUtil.close();
        }

    }
}
