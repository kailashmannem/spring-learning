package com.application.restful_web_services.user;

import java.util.*;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
    private static List<User> users = new ArrayList<>();
    private static int usersCount = 0;
    static {
        users.add(new User(++usersCount, "Adam", java.time.LocalDate.now().minusYears(30)));
        users.add(new User(++usersCount, "Eve", java.time.LocalDate.now().minusYears(25)));
        users.add(new User(++usersCount, "Jack", java.time.LocalDate.now().minusYears(28)));
    }
    public List<User> findAll() {
        return users;
    }
    public void save(User user) {
        usersCount += 1;
        users.add(user);
    }
    public User findOne(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }
    public void deleteById(int id) {
        users.removeIf(user -> user.getId() == id);
    }
}
