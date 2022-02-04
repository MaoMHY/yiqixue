package yiqixue.yiqixue.houtai.htDao;

import yiqixue.yiqixue.houtai.htModel.Question;
import yiqixue.yiqixue.houtai.htModel.message;

import java.util.List;

public interface QuestionDao {
    List<Question> findAllQuestion();
    List<Question> findAllByQid(int qid);
}
