package yiqixue.yiqixue.houtai.htDao;

import org.apache.ibatis.annotations.Mapper;
import yiqixue.yiqixue.houtai.htModel.Daily;
import yiqixue.yiqixue.houtai.htModel.User;

import java.util.List;

@Mapper
public interface DailyDao {
    List<Daily> findAllDaily();
    List<Daily> findAllByDid(int did);
}
