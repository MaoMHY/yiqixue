package yiqixue.yiqixue.houtai.htService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yiqixue.yiqixue.houtai.htDao.MessageDao;
import yiqixue.yiqixue.houtai.htModel.User;
import yiqixue.yiqixue.houtai.htModel.message;

import java.util.List;

@Service
public class MessageService {

    @Autowired
    MessageDao messageDao;

    public List<message> findAllMessage(){
        return messageDao.findAllMessage();
    }

    public List<message> findAllByMid(int mid){
        return messageDao.findAllByMid(mid);
    }
}
