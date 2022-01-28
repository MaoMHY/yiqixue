package yiqixue.yiqixue.yantaoshi.server;

import yiqixue.yiqixue.yantaoshi.model.answer;
import java.util.List;

public interface answerServer {
    int add(answer a);
    int delete(answer a);
    List<answer> inquire();
    answer inquire(int aid);
}
