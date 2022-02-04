package yiqixue.yiqixue.houtai.htController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yiqixue.yiqixue.houtai.htModel.Star;
import yiqixue.yiqixue.houtai.htModel.Tipoff;
import yiqixue.yiqixue.houtai.htService.TipoffService;

import java.util.List;

@RestController
public class tipoffcontroller {

    @Autowired
    TipoffService tipoffService;

    @RequestMapping("/findAllTipoff")
    public List<Tipoff> findAllTipoff(){
        return tipoffService.findAllTippff();
    }

    @RequestMapping("/findAllByTid")
    public  List<Tipoff> findAllByTid(int tid){
        List<Tipoff> list=tipoffService.findAllByTid(tid);
        System.out.println(list);
        return list;
    }
}
