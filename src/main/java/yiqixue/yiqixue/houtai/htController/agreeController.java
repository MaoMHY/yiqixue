package yiqixue.yiqixue.houtai.htController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yiqixue.yiqixue.houtai.htModel.Agree;
import yiqixue.yiqixue.houtai.htModel.User;
import yiqixue.yiqixue.houtai.htService.AgreeService;

import java.util.List;

@RestController
public class agreeController {

    @Autowired
    AgreeService agreeService;

    @RequestMapping("/findAllAgree")
    public List<Agree> findAll(){
        return agreeService.findAll();
    }

    @RequestMapping("/findAllByAgid")
    public  List<Agree> findAllByAgid(int agid){
        List<Agree> list=agreeService.findAllByAgid(agid);
        System.out.println(list);
        return list;
    }
}
