package yiqixue.yiqixue.yantaoshi.Dao;


import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import yiqixue.yiqixue.yantaoshi.model.answer;

import javax.annotation.Resource;
import java.util.List;

//数据访问层
@Repository
public class answerDaoImpl implements answerDao {

    @Resource
    private JdbcTemplate jdbcTemplate;

    public int add(answer a) {
        return jdbcTemplate.update("insert into 'answer' " +
                "('uid','qid','recallaid','recalluid','text','img','agree','star','tip','date','time')" +
                "values (?,?,?,?,?,?,?,?,?,?,?)" ,a.getUid(),
                a.getQid(),a.getRecallaid(),a.getRecalluid(),a.getText(),a.getImg(),a.getAgree(),
                a.getStar(),a.getTip(),a.getDate(),a.getTime());
    }


    public int delete(answer a) {
        return jdbcTemplate.update("delete from answer where aid==?"+a.getAid());
    }


    public List<answer> inquire() {
        List<answer>list;
        list=jdbcTemplate.query("select * from answer",new BeanPropertyRowMapper<>(answer.class));
        return list;
    }

    @Override
    public answer inquire(int aid) {
        answer a;
        a=jdbcTemplate.queryForObject("select * from 'answer' where aid=?",new BeanPropertyRowMapper<>(answer.class),aid);
        return a;
    }
}
