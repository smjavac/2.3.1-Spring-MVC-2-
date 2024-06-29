package web.dao;

import web.models.User;

import java.util.List;

public interface UserDao {
    void addUser(User user);
    List<User> getAllUsers();
    void removeUser(long id);
    User getUserById(long userid);
    void updateUser(long id,User user);
}
