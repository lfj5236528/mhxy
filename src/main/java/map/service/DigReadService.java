package map.service;

import map.model.MapArea;
import map.model.MapData;
import map.model.MapGoods;
import map.model.MapTime;

import java.util.List;

/**
 * Created by liangfujie on 16/11/10
 */
public interface DigReadService {

    public List<MapArea>  findAllMapArea();
    public List<MapTime>  findAllMapTime();
    public List<MapGoods>  findAllMapGoods();
    public List<MapData> findMapDataByPoint(int x,int y,int areaId);
    public Integer findMapDataCounts();

}
