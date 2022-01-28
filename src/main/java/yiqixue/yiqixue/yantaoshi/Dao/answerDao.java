package yiqixue.yiqixue.yantaoshi.Dao;

import yiqixue.yiqixue.yantaoshi.model.answer;
import java.util.List;

public interface answerDao {
    int add(answer a);
    int delete(answer a);
    List<answer> inquire();
    answer inquire(int aid);
}
