package web.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import web.models.User;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao {
    @PersistenceContext
    private EntityManager em;

    @Override
    public void addUser(User user) {
        em.persist(user);
    }

    @Override
    public List<User> getAllUsers() {
        List<User> users = em.createQuery("from User").getResultList();
        return users;
    }

    @Override
    public void deleteUser(User user) {
        em.remove(user);
    }

    @Override
    public User getUser(long userid) {
        return em.find(User.class, userid);
    }

    @Override
    public void updateUser(int id, User updateUser) {
        em.merge(updateUser);

    }
}
