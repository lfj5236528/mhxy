package map.impl;

import map.dao.MapAreaDao;
import map.dao.MapDataDao;
import map.dao.MapGoodsDao;
import map.dao.MapTimeDao;
import map.model.MapArea;
import map.model.MapData;
import map.model.MapGoods;
import map.model.MapTime;
import map.service.DigWriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * Created by liangfujie on 16/11/10
 */
@Component
public class DigWriteServiceImpl implements DigWriteService{

    @Autowired
    private MapAreaDao mapAreaDao;

    @Autowired
    private MapTimeDao mapTimeDao;
    @Autowired
    private MapGoodsDao mapGoodsDao;
    @Autowired
    private MapDataDao mapDataDao;

    @Override
    public int createArea(MapArea mapArea) {
        return mapAreaDao.create("",mapArea);
    }

    @Override
    public int createTime(MapTime mapTime) {
        return 0;
    }

    @Override
    public int createMapData(MapData mapData) {
        return mapDataDao.create("create",mapData);
    }

    @Override
    public int createGoods(MapGoods mapGoods) {
        return 0;
    }
}
