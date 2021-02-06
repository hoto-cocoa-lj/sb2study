package jp.slq.mapper;

import jp.slq.pojo.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    @Select("SELECT * FROM student where id=#{id}")
    public User select1(int id);

    public List<User> select();

    public void insert1(User user);

    public void del(int id);
}
