package web.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

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
        String getAllQuery = "select u from User u";
        TypedQuery<User> query = em.createQuery(getAllQuery, User.class);
        return query.getResultList();
    }

    @Override
    public User getUserById(long userid) {
        return em.find(User.class, userid);
    }

    @Override
    public void updateUser(long id, User updateUser) {
        em.merge(updateUser);

    }

    @Override
    public void removeUser(long id) {
        em.remove(getUserById(id));
    }
}
