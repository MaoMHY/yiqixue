package yiqixue.yiqixue.houtai.htController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yiqixue.yiqixue.houtai.htModel.Answer;
import yiqixue.yiqixue.houtai.htModel.User;
import yiqixue.yiqixue.houtai.htService.AnswerService;

import java.util.List;

@RestController
public class answerController {

    @Autowired
    AnswerService answerService;

    @RequestMapping("/findAllAnswer")
    public List<Answer> findAllAnswer(){
        return answerService.findAllAnswer();
    }

    @RequestMapping("/findAllByAid")
    public  List<Answer> findAllByUid(int uid){
        List<Answer> list=answerService.findAllByAid(uid);
        System.out.println(list);
        return list;
    }
}
