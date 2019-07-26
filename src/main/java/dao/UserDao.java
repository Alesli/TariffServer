package dao;

import entity.User;

import java.util.List;

public interface UserDao {

    List<User> findAll();
    List<User> findBalanceById();
}
