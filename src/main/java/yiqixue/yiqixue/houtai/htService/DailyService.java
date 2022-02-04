package yiqixue.yiqixue.houtai.htService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yiqixue.yiqixue.houtai.htDao.DailyDao;
import yiqixue.yiqixue.houtai.htModel.Daily;
import yiqixue.yiqixue.houtai.htModel.User;

import java.util.List;

@Service
public class DailyService {

    @Autowired
    DailyDao dailyDao;

    public List<Daily> findAllDaily(){
        return dailyDao.findAllDaily();
    }
    public List<Daily> findAllByDid(int did){
        return dailyDao.findAllByDid(did);
    }
}
