package yiqixue.yiqixue.houtai.htService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yiqixue.yiqixue.houtai.htDao.AnswerDao;
import yiqixue.yiqixue.houtai.htModel.Answer;

import java.util.List;

@Service
public class AnswerService {

    @Autowired
    AnswerDao answerDao;

    public List<Answer> findAllAnswer(){
        return answerDao.findAllAnswer();
    }
    public List<Answer> findAllByAid(int aid){
        return answerDao.findAllByAid(aid);
    }
}
