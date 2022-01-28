package yiqixue.yiqixue.yantaoshi.server;

import org.springframework.stereotype.Service;
import yiqixue.yiqixue.yantaoshi.Dao.questionDao;
import yiqixue.yiqixue.yantaoshi.model.question;
import javax.annotation.Resource;
import java.util.List;

@Service
public class questionServerImpl implements questionServer{
    @Resource
    private questionDao questiondao;

    @Override
    public int add(question a) {
        return questiondao.add(a);
    }

    @Override
    public int delete(question a) {
        return questiondao.delete(a);
    }

    @Override
    public int update(question a) {
        return questiondao.update(a);
    }

    @Override
    public question inquire(int qid) {
        return questiondao.inquire(qid);
    }

    @Override
    public List<question> inquire() {
        return questiondao.inquire();
    }
}
