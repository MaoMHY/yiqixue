package yiqixue.yiqixue.houtai.htDao;

import org.apache.ibatis.annotations.Mapper;
import yiqixue.yiqixue.houtai.htModel.Agree;
import yiqixue.yiqixue.houtai.htModel.Answer;

import java.util.List;

@Mapper
public interface AnswerDao {
    List<Answer> findAllAnswer();
    List<Answer> findAllByAid(int aid);
}
