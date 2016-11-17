package map.dao;

import map.model.MapData;
import map.utils.MybatisHelper;
import org.apache.ibatis.ognl.IntHashMap;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by liangfujie on 16/11/10
 */
@Component
public class MapDataDao extends MybatisHelper<MapData> {
    public MapDataDao() {
        super("dig.map.data");
    }
    public List<MapData> findMapGoodsByPoint(int x, int y,int areaId){
        Map<String,Object> maps = new HashMap<String,Object>();
        maps.put("pointX",x);
        maps.put("pointY",y);
        maps.put("areaId",areaId);
        return getSqlSession().selectList(getSqlName("findMapGoodsByPoint"),maps);
    }
    public Integer findMapDataCounts(){
        return getSqlSession().selectOne(getSqlName("findMapDataCounts"));
    }


}
