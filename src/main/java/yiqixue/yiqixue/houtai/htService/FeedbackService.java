package yiqixue.yiqixue.houtai.htService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yiqixue.yiqixue.houtai.htDao.FeedbackDao;
import yiqixue.yiqixue.houtai.htModel.Feedback;

import java.util.List;

@Service
public class FeedbackService {

    @Autowired
    FeedbackDao feedbackDao;

    public List<Feedback> findAllFeedback(){
        return feedbackDao.findAllFeedback();
    }
    public List<Feedback> findAllByFid(int fid){
        return feedbackDao.findAllByFid(fid);
    }
}
