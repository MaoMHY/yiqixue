package yiqixue.yiqixue.yantaoshi.Dao;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import yiqixue.yiqixue.yantaoshi.model.question;

import javax.annotation.Resource;
import java.util.List;

//数据访问层
@Repository
public class questionDaoImpl implements questionDao {
    @Resource
    private JdbcTemplate jdbcTemplate;

    public int add(question a) {
        return jdbcTemplate.update(
                "insert into 'question'('uid','title','text','img','value','date','time'," +
                        "'learning','higherschool','practice','jobwanted','economics','literature','science'," +
                        "'engineering','medicine','business','applyforresearch','examination','recommend'," +
                        "'usa','britain','australia','hongkong','singapore') values" +
                        "(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",
                a.getUid(), a.getTitle(), a.getText(), a.getImg(), a.getValue(), a.getDate(), a.getTime(), a.getLearning(),
                a.getHigherschool(), a.getPractice(), a.getJobwanted(), a.getEconomics(), a.getLiterature(), a.getScience(),
                a.getEngineering(), a.getMedicine(), a.getBusiness(), a.getApplyforresearch(), a.getExamination(), a.getRecommend(),
                a.getUsa(), a.getBritain(), a.getAustralia(), a.getHongkong(), a.getSingapore());
    }

    public int delete(question a) {
        return jdbcTemplate.update("delete from question where qid==?", a.getQid());
    }

    @Override
    public List<question> inquire() {
        List<question> list;
        list = jdbcTemplate.query("select * from 'question'", new BeanPropertyRowMapper<>(question.class));
        return list;
    }

    public int update(question a) {
        return jdbcTemplate.update("update 'question' set 'title'=?,'text'=? where 'qid'=?",a.getTitle(),a.getText(),a.getQid());
    }

    @Override
    public question inquire(int qid) {
        question a;
        a = jdbcTemplate.queryForObject("select * from 'question' where qid==?", new BeanPropertyRowMapper<>(question.class), qid);
        return a;
    }
}
