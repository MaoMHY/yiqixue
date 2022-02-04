package yiqixue.yiqixue.houtai.htService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yiqixue.yiqixue.houtai.htDao.TipoffDao;
import yiqixue.yiqixue.houtai.htModel.Star;
import yiqixue.yiqixue.houtai.htModel.Tipoff;

import java.util.List;

@Service
public class TipoffService {

    @Autowired
    TipoffDao tipoffDao;

    public List<Tipoff> findAllTippff(){
        return tipoffDao.findAllTipoff();
    }

    public List<Tipoff> findAllByTid(int tid){
        return tipoffDao.findAllByTid(tid);
    }
}
