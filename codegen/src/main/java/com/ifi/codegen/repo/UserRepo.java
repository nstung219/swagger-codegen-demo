package com.ifi.codegen.repo;

import com.ifi.codegen.repo.database.FakeDb;
import com.ifi.swagger.model.User;

public class UserRepo {
    public static User findUserDetailsById(Long userId){
        return FakeDb.users.get(userId);
    }

    public static void saveUser(User user){
        FakeDb.users.put(user.getId(), user);
    }
}
