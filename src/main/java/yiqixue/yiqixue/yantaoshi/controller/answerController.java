package yiqixue.yiqixue.yantaoshi.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yiqixue.yiqixue.yantaoshi.model.*;
import javax.annotation.Resource;
import java.util.List;
import yiqixue.yiqixue.yantaoshi.server.*;

@RestController
@RequestMapping("/answer")
public class answerController{
    @Resource
    private answerServer a;

    @RequestMapping("/add")
    public String add(@RequestBody answer b) {
        return a.add(b)==1?"保存成功":"保存失败";
    }
    @RequestMapping("/delete")
    public String delete(@RequestBody answer b) {
        return a.delete(b)==1?"删除成功":"删除失败";
    }
    @RequestMapping("/inquireAll")
    public List<answer> inquire() {
        return a.inquire();
    }
    @RequestMapping("/inquireOne")
    public answer inquire(@PathVariable int aid)
    {
       return a.inquire(aid);
    }
}
