package yiqixue.yiqixue.houtai.htController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import yiqixue.yiqixue.houtai.htModel.Daily;
import yiqixue.yiqixue.houtai.htModel.Feedback;
import yiqixue.yiqixue.houtai.htService.FeedbackService;

import java.util.List;

public class feedbackController {

    @Autowired
    FeedbackService feedbackService;

    @RequestMapping("/findAllFeedback")
    public List<Feedback> findAllFeedback(){
        return feedbackService.findAllFeedback();
    }

    @RequestMapping("/findAllByFid")
    public  List<Feedback> findAllByFid(int fid){
        List<Feedback> list=feedbackService.findAllByFid(fid);
        System.out.println(list);
        return list;
    }
}
