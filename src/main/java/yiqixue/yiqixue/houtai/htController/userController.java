package yiqixue.yiqixue.houtai.htController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yiqixue.yiqixue.houtai.htModel.User;
import yiqixue.yiqixue.houtai.htService.UserService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class userController {

    @Autowired
    UserService userService;

    @RequestMapping("/getUserName")
    public User getUserName(){
        return null;
    }

    @RequestMapping("/findAll")
    public List<User> findAll(){
        return userService.findAll();
    }

    @RequestMapping("/findAllByUid")
    public  List<User> findAllByUid(int uid){
        List<User> list=userService.findAllByUid(uid);
        System.out.println(list);
        return list;
    }

    @RequestMapping("/deleteByUid")
    public Map deleteByUid(int uid){
        int count=userService.deleteByUid(uid);
        Map map=new HashMap();
        map.put("count",count);
        if(count>0){
            map.put("status",true);
            map.put("message","删除成功！");
        }else{
            map.put("status",false);
            map.put("message","删除失败！");
        }
        return map;
    }

    Map resultData(boolean status,String message,Object data){
        Map map=new HashMap<String,Object>();
        map.put("status",status);
        map.put("message",message);
        map.put("data",data);
        return map;
    }

    @RequestMapping("/insertUser")
    public Map insertUser(User user){
        int count=userService.insertUser(user);
        return resultData(count>0,count>0?"添加成功！":"添加失败！",count);
    }

    @RequestMapping("/updateUser")
    public Map updateUser(User user){
        int count=userService.updateUser(user);
        return resultData(count>0,count>0?"更新成功！":"更新失败！",count);
    }
}
