package com.ccunix.reading.service.impl;

import com.ccunix.reading.dao.UserMapper;
import com.ccunix.reading.domain.User;
import com.ccunix.reading.service.TestService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public String test() {
        return "test service";
    }

    @Override
    public String testMapper() {
        List<User> list = userMapper.getAll();
        return new Gson().toJson(list);
    }
}
