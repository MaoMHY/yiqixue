package yiqixue.yiqixue.yantaoshi.server;

import org.springframework.stereotype.Service;
import yiqixue.yiqixue.yantaoshi.Dao.answerDao;
import yiqixue.yiqixue.yantaoshi.model.answer;
import javax.annotation.Resource;
import java.util.List;

@Service
public class answerServerImpl implements answerServer{
    @Resource
    private answerDao answerdao;

    @Override
    public int add(answer a) {
        return answerdao.add(a);
    }

    @Override
    public int delete(answer a) {
        return answerdao.delete(a);
    }

    @Override
    public answer inquire(int aid) {
        return answerdao.inquire(aid);
    }

    @Override
    public List<answer> inquire() {
        return answerdao.inquire();
    }
}
