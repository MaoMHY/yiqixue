package yiqixue.yiqixue.houtai.htService;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import yiqixue.yiqixue.houtai.htDao.QuestionDao;
import yiqixue.yiqixue.houtai.htModel.Question;
import yiqixue.yiqixue.houtai.htModel.Resource;

import java.util.List;

@Mapper
public class QuestionService {

    @Autowired
    QuestionDao questionDao;


    public List<Question> findAllQuestion(){
        return questionDao.findAllQuestion();
    }

    public List<Question> findAllByQid(int qid){
        return questionDao.findAllByQid(qid);
    }
}
