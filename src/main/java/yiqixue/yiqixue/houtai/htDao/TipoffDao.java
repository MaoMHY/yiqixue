package yiqixue.yiqixue.houtai.htDao;

import org.apache.ibatis.annotations.Mapper;
import yiqixue.yiqixue.houtai.htModel.Star;
import yiqixue.yiqixue.houtai.htModel.Tipoff;

import java.util.List;

@Mapper
public interface TipoffDao {
    List<Tipoff> findAllTipoff();
    List<Tipoff> findAllByTid(int tid);
}
