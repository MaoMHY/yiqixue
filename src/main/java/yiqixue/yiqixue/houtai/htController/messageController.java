package yiqixue.yiqixue.houtai.htController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import yiqixue.yiqixue.houtai.htModel.User;
import yiqixue.yiqixue.houtai.htModel.message;
import yiqixue.yiqixue.houtai.htService.MessageService;

import java.util.List;

public class messageController {

    @Autowired
    MessageService messageService;

    @RequestMapping("/findAllMessage")
    public List<message> findAll(){
        return messageService.findAllMessage();
    }

    @RequestMapping("/findAllByMid")
    public  List<message> findAllByUid(int mid){
        List<message> list=messageService.findAllByMid(mid);
        System.out.println(list);
        return list;
    }
}
