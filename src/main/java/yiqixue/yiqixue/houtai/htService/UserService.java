package yiqixue.yiqixue.houtai.htService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yiqixue.yiqixue.houtai.htDao.UserDao;
import yiqixue.yiqixue.houtai.htModel.User;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserDao userDao;

    public List<User> findAll(){
        return userDao.findAll();
    }

    public List<User> findAllByUid(int uid){
        return userDao.findAllByUid(uid);
    }

    public int deleteByUid(int uid){
        return userDao.deleteByUid(uid);
    }

    public int insertUser(User user){
        return userDao.insertUser(user);
    }

    public int updateUser(User user){
        return userDao.updateUser(user);
    }
}
