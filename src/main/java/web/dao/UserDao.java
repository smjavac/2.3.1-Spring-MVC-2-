package web.dao;

import web.models.User;

import java.util.List;

public interface UserDao {
    public void addUser(User user);
    public List<User> getAllUsers();
    public void deleteUser(User user);
    public User getUser(long userid);
    public void updateUser(int id,User user);
}
