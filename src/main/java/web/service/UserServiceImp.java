package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.UserDao;
import web.models.User;
import javax.transaction.Transactional;
import java.util.List;
@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    @Transactional
    public void addUser(User user) {
        userDao.addUser(user);
    }


    @Override
    @Transactional
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }


    @Override
    @Transactional
    public void deleteUser(User user) {
        userDao.deleteUser(user);
    }

    @Override
    @Transactional
    public User getUser(long userid) {

        return userDao.getUser(userid);
    }


    @Override
    @Transactional
    public void updateUser(int id, User user) {
        userDao.updateUser(id, user);
    }
}
