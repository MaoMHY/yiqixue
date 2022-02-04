package yiqixue.yiqixue.houtai.htService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yiqixue.yiqixue.houtai.htDao.ResourceDao;
import yiqixue.yiqixue.houtai.htModel.Resource;
import yiqixue.yiqixue.houtai.htModel.message;

import java.util.List;

@Service
public class ResourceService {

    @Autowired
    ResourceDao resourceDao;

    public List<Resource> findAllMessage(){
        return resourceDao.findAllResource();
    }

    public List<Resource> findAllByMid(int rid){
        return resourceDao.findAllByRid(rid);
    }
}
