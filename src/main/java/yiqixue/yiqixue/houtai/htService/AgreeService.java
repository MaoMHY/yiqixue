package yiqixue.yiqixue.houtai.htService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yiqixue.yiqixue.houtai.htDao.AgreeDao;
import yiqixue.yiqixue.houtai.htModel.Agree;
import yiqixue.yiqixue.houtai.htModel.User;

import java.util.List;

@Service
public class AgreeService {

    @Autowired
    AgreeDao agreeDao;

    public List<Agree> findAll(){
        return agreeDao.findAll();
    }

    public List<Agree> findAllByAgid(int agid){
        return agreeDao.findAllByAgid(agid);
    }

}
