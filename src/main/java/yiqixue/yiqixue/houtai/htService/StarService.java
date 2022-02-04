package yiqixue.yiqixue.houtai.htService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yiqixue.yiqixue.houtai.htDao.StarDao;
import yiqixue.yiqixue.houtai.htModel.Resource;
import yiqixue.yiqixue.houtai.htModel.Star;

import java.util.List;

@Service
public class StarService {

    @Autowired
    StarDao starDao;

    public List<Star> findAllStar(){
        return starDao.findAllStar();
    }

    public List<Star> findAllByMid(int sid){
        return starDao.findAllBySid(sid);
    }
}
