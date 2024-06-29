package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import web.dao.UserDao;
import web.models.User;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    @Transactional(readOnly = true)
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    @Transactional(readOnly = true)
    public User getUserById(long userid) {

        return userDao.getUserById(userid);
    }

    @Override
    @Transactional
    public void addUser(User user) {
        userDao.addUser(user);
    }



    @Override
    @Transactional
    public void removeUser(long id) {
        userDao.removeUser(id);
    }


    @Override
    @Transactional
    public void updateUser(long id, User user) {
        userDao.updateUser(id, user);
    }
}
