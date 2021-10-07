package com.ifi.demo.user.repo;

import com.ifi.demo.user.database.FakeDb;
import com.ifi.demo.user.model.User;

public class UserRepo {
    public static User saveUser(User user){
        FakeDb.users.put(user.getId(), user);
        return user;
    }

    public static User findUserById(Long userId){
        return FakeDb.users.get(userId);
    }
}
