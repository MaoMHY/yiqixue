package yiqixue.yiqixue.houtai.htController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yiqixue.yiqixue.houtai.htModel.Daily;
import yiqixue.yiqixue.houtai.htModel.User;
import yiqixue.yiqixue.houtai.htService.DailyService;

import java.util.List;

@RestController
public class dailyController {

    @Autowired
    DailyService dailyService;

    @RequestMapping("/findAllDaiy")
    public List<Daily> findAll(){
        return dailyService.findAllDaily();
    }

    @RequestMapping("/findAllByDid")
    public  List<Daily> findAllByUid(int did){
        List<Daily> list=dailyService.findAllByDid(did);
        System.out.println(list);
        return list;
    }
}
