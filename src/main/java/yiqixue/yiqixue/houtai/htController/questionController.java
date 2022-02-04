package yiqixue.yiqixue.houtai.htController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yiqixue.yiqixue.houtai.htModel.Question;
import yiqixue.yiqixue.houtai.htModel.Resource;
import yiqixue.yiqixue.houtai.htService.QuestionService;

import java.util.List;

@RestController
public class questionController {

    @Autowired
    QuestionService questionService;

    @RequestMapping("/findAllQuestion")
    public List<Question> findAllQuestion(){
        return questionService.findAllQuestion();
    }

    @RequestMapping("/findAllByRid")
    public  List<Question> findAllByRid(int qid){
        List<Question> list=questionService.findAllByQid(qid);
        System.out.println(list);
        return list;
    }
}
