package map.dao;

import map.model.MapTime;
import map.utils.MybatisHelper;
import org.springframework.stereotype.Component;

/**
 * Created by liangfujie on 16/11/10
 */
@Component
public class MapTimeDao extends MybatisHelper<MapTime>{
    public MapTimeDao() {
        super("dig.map.time");
    }
}
