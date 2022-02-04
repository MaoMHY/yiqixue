package yiqixue.yiqixue.houtai.htDao;

import org.apache.ibatis.annotations.Mapper;
import yiqixue.yiqixue.houtai.htModel.Resource;
import yiqixue.yiqixue.houtai.htModel.message;

import java.util.List;

@Mapper
public interface ResourceDao {
    List<Resource> findAllResource();
    List<Resource> findAllByRid(int rid);
}
