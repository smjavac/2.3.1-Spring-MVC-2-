package web.dao;

import web.models.User;

import java.util.List;

public interface UserDao {
    public void addUser(User user);
    public List<User> getAllUsers();
    void removeUser(long id);
    public User getUserById(long userid);
    public void updateUser(long id,User user);
}
