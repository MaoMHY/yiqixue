package yiqixue.yiqixue.houtai.htDao;

import org.apache.ibatis.annotations.Mapper;
import yiqixue.yiqixue.houtai.htModel.Feedback;

import java.util.List;
@Mapper
public interface FeedbackDao {
    List<Feedback> findAllFeedback();
    List<Feedback> findAllByFid(int fid);
}
