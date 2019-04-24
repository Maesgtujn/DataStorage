package com.service;

import com.dao.UserDemoMapper;
import com.entity.UserDemo;
import com.entity.UserDemoExample;
import com.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TestServiceImpl implements TestService{

    @Autowired
    UserDemoMapper userDemoMapper;

    @Autowired
    RedisTemplate redisTemplate;

    @Override
    public int add(User user) {
        UserDemo userDemo = new UserDemo();
        userDemo.setUserIdCardNo(user.getIdCard());
        userDemo.setUserName(user.getName());
        userDemo.setUserPhone(user.getPhone());
        Map<String, Object> map = new HashMap<>();
        map.put("name", userDemo.getUserName());
        map.put("phone", userDemo.getUserPhone());
        redisTemplate.opsForHash().put("demo", userDemo.getUserIdCardNo(), map.toString());
        return userDemoMapper.insert(userDemo);
    }

    @Override
    public String query(int id) {

        Object result = redisTemplate.opsForHash().get("demo", String.valueOf(id));
        if (result != null){
            String parser = result.toString();
            return parser.split(",")[1].split("=")[1];
        }
        else {
            UserDemoExample userDemoExample = new UserDemoExample();
            userDemoExample.createCriteria().andUserIdCardNoEqualTo(String.valueOf(id));
            List<UserDemo> dbresult = userDemoMapper.selectByExample(userDemoExample);
            return dbresult.get(0).getUserName();
        }
    }
}
