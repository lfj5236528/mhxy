package map.service;

import map.model.MapArea;
import map.model.MapData;
import map.model.MapGoods;
import map.model.MapTime;

/**
 * Created by liangfujie on 16/11/10
 */
public interface DigWriteService {
    public int createArea(MapArea mapArea);
    public int createTime(MapTime mapTime);
    public int createMapData(MapData mapData);
    public int createGoods(MapGoods mapGoods);
}
