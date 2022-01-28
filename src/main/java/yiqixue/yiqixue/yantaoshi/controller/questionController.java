package yiqixue.yiqixue.yantaoshi.controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yiqixue.yiqixue.yantaoshi.model.*;
import java.util.List;
import yiqixue.yiqixue.yantaoshi.server.*;

@RestController
@RequestMapping("/question")
public class questionController{
    private questionServer a;
    @RequestMapping("/add")

    public String add(@RequestBody question b) {
        return a.add(b)==1?"保存成功":"保存失败";
    }
    @RequestMapping("/delete")
    public String delete(@RequestBody question b) {
        return a.delete(b)==1?"删除成功":"删除失败";
    }
    @RequestMapping("/inquireAll")
    public List<question> inquire() {
        return a.inquire();
    }
    @RequestMapping("/inquireOne")
    public question inquire(@PathVariable int qid) {
        return a.inquire(qid);
    }
    @RequestMapping("/update")
    public String update(@RequestBody question b) {
        return a.update(b)==1?"修改成功":"修改失败";
    }
}
