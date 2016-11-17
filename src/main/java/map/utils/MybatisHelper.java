package map.utils;

import lombok.Data;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by liangfujie on 16/11/10
 */
@Data
public class MybatisHelper<T> {
    @Autowired
    private SqlSession sqlSession;

    private String nameSpace;

    public MybatisHelper(String nameSpace) {
        this.nameSpace = nameSpace;
    }

    public String getSqlName(String sqlName) {
        return  nameSpace +"."+ sqlName;
    }

    public Integer create(String name, T obj) {
        return sqlSession.insert(getSqlName(name), obj);
    }

    public Boolean update(String name, T obj) {
        return Boolean.valueOf(sqlSession.update(getSqlName(name), obj) > 0);
    }

    public T findById(String name, Long id) {
        return sqlSession.selectOne(getSqlName(name), id);
    }

    public Boolean delete(String name, Long id) {
        return Boolean.valueOf(sqlSession.delete(getSqlName(name), id) > 0);
    }

    public List<T> findAll(String name){return  sqlSession.selectList(getSqlName(name));}

}
