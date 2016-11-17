package map.dao;

import map.model.MapArea;
import map.utils.MybatisHelper;
import org.springframework.stereotype.Component;

/**
 * Created by liangfujie on 16/11/10
 */
@Component
public class MapAreaDao extends MybatisHelper<MapArea>{
    public MapAreaDao() {
        super("dig.map.area");
    }
}
