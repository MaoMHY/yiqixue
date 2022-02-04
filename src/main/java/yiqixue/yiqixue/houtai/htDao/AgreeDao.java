package yiqixue.yiqixue.houtai.htDao;
import org.apache.ibatis.annotations.Mapper;
import yiqixue.yiqixue.houtai.htModel.Agree;

import java.util.List;

@Mapper
public interface AgreeDao {
    List<Agree> findAll();
    List<Agree> findAllByAgid(int agid);
}
