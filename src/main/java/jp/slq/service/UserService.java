package jp.slq.service;

import jp.slq.mapper.UserMapper;
import jp.slq.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired
    UserMapper userMapper;
    public User select1(int id){
        return userMapper.select1(id);
    }
    public List<User> select(){
        return userMapper.select();
    }

    public void insert1(User user){
        System.out.println("before:"+user);
        userMapper.insert1(user);
        System.out.println("after:"+user);
    }

    public void del(int id) {
        userMapper.del(id);
    }

    public void testTX(){
        User user=new User();
        user.setName(System.currentTimeMillis()+"");
        user.setAge(11);
        userMapper.insert1(user);
        int i=1/0;
        userMapper.del(53);
    }
}
