package com.service;

import com.model.User;

public interface TestService {
    int add(User user);

    String query(int id);
}
