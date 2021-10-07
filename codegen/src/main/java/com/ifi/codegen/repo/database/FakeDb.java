package com.ifi.codegen.repo.database;

import com.ifi.swagger.model.User;

import java.util.HashMap;
import java.util.Map;

public class FakeDb {
    public static Map<Long, User> users = new HashMap<>();
}
