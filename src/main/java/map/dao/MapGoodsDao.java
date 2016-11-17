package map.dao;

import map.model.MapGoods;
import map.utils.MybatisHelper;
import org.springframework.stereotype.Component;

/**
 * Created by liangfujie on 16/11/10
 */
@Component
public class MapGoodsDao extends MybatisHelper<MapGoods>{
    public MapGoodsDao() {
        super("dig.map.goods");
    }
}
