package yiqixue.yiqixue.houtai.htController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yiqixue.yiqixue.houtai.htModel.Resource;
import yiqixue.yiqixue.houtai.htModel.message;
import yiqixue.yiqixue.houtai.htService.ResourceService;

import java.util.List;

@RestController
public class resourceController {

    @Autowired
    ResourceService resourceService;

    @RequestMapping("/findAllResource")
    public List<Resource> findAllResource(){
        return resourceService.findAllMessage();
    }

    @RequestMapping("/findAllByRid")
    public  List<Resource> findAllByRid(int rid){
        List<Resource> list=resourceService.findAllByMid(rid);
        System.out.println(list);
        return list;
    }
}
