package yiqixue.yiqixue.yantaoshi.Dao;

import yiqixue.yiqixue.yantaoshi.model.question;

import java.util.List;

public interface questionDao {
    int add(question a);
    int delete(question a);
    int update(question a);
    List<question> inquire();
    question inquire(int qid);
}
