package com.ifi.demo.user.database;

import com.ifi.demo.user.model.User;

import java.util.HashMap;
import java.util.Map;

public class FakeDb {
    public static Map<Long, User> users = new HashMap<>();
}
