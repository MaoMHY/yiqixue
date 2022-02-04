package yiqixue.yiqixue.houtai.htDao;

import org.apache.ibatis.annotations.Mapper;
import yiqixue.yiqixue.houtai.htModel.Agree;
import yiqixue.yiqixue.houtai.htModel.message;

import java.util.List;

@Mapper
public interface MessageDao {
    List<message> findAllMessage();
    List<message> findAllByMid(int mid);
}
