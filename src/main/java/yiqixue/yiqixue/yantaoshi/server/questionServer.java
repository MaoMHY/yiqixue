package yiqixue.yiqixue.yantaoshi.server;

import yiqixue.yiqixue.yantaoshi.model.question;
import java.util.List;

public interface questionServer {
    int add(question a);
    int delete(question a);
    int update(question a);
    List<question> inquire();
    question inquire(int qid);
}
