package yiqixue.yiqixue.houtai.htController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yiqixue.yiqixue.houtai.htModel.Resource;
import yiqixue.yiqixue.houtai.htModel.Star;
import yiqixue.yiqixue.houtai.htService.StarService;

import java.util.List;

@RestController
public class starController {

    @Autowired
    StarService starService;

    @RequestMapping("/findAllStar")
    public List<Star> findAllStar(){
        return starService.findAllStar();
    }

    @RequestMapping("/findAllBySid")
    public  List<Star> findAllBySid(int sid){
        List<Star> list=starService.findAllByMid(sid);
        System.out.println(list);
        return list;
    }
}
