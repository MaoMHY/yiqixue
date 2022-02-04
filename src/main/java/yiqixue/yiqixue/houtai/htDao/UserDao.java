package yiqixue.yiqixue.houtai.htDao;

import org.apache.ibatis.annotations.Mapper;
import yiqixue.yiqixue.houtai.htModel.User;

import java.util.List;

@Mapper
public interface UserDao {
    List<User> findAll();
    List<User> findAllByUid(int uid);
    int deleteByUid(int uid);
    int insertUser(User user);
    int updateUser(User user);
}
