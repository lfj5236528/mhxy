package map.impl;

import map.dao.MapAreaDao;
import map.dao.MapDataDao;
import map.dao.MapGoodsDao;
import map.dao.MapTimeDao;
import map.model.MapArea;
import map.model.MapData;
import map.model.MapGoods;
import map.model.MapTime;
import map.service.DigReadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by liangfujie on 16/11/10
 */
@Component
public class DigReadServiceImpl implements DigReadService{

    @Autowired
    private MapAreaDao mapAreaDao;
    @Autowired
    private MapTimeDao mapTimeDao;
    @Autowired
    private MapGoodsDao mapGoodsDao;
    @Autowired
    private MapDataDao mapDataDao;


    @Override
    public List<MapArea> findAllMapArea() {
        return mapAreaDao.findAll("findAll");
    }

    @Override
    public List<MapTime> findAllMapTime() {
        return mapTimeDao.findAll("findAll");
    }

    @Override
    public List<MapGoods> findAllMapGoods() {
        return mapGoodsDao.findAll("findAll");
    }

    @Override
    public List<MapData> findMapDataByPoint(int x, int y,int areaId) {
        return mapDataDao.findMapGoodsByPoint(x,y, areaId);
    }

    @Override
    public Integer findMapDataCounts() {

        return mapDataDao.findMapDataCounts();
    }


}
