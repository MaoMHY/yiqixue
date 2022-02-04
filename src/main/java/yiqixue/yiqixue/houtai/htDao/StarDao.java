package yiqixue.yiqixue.houtai.htDao;

import org.apache.ibatis.annotations.Mapper;
import yiqixue.yiqixue.houtai.htModel.Resource;
import yiqixue.yiqixue.houtai.htModel.Star;

import java.util.List;

@Mapper
public interface StarDao {
    List<Star> findAllStar();
    List<Star> findAllBySid(int sid);
}
