package map.controller;

import map.model.MapArea;
import map.model.MapData;
import map.model.MapGoods;
import map.model.MapTime;
import map.service.DigReadService;
import map.service.DigWriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by liangfujie on 16/11/10
 */
@RestController

@CrossOrigin
public class DigMapDataController {

    @Autowired
    private DigReadService digReadService;

    @Autowired
    private DigWriteService digWriteService;

    @RequestMapping(value = "/create/area", method = RequestMethod.POST)
    public String create(MapArea mapArea,HttpServletResponse response)
    {
        response.setHeader("Access-Control-Allow-Origin","*");
        return String.valueOf(digWriteService.createArea(mapArea));
    }

    @RequestMapping(value = "/create/time", method = RequestMethod.POST)
    public String create(MapTime mapTime) {
        return String.valueOf(digWriteService.createTime(mapTime));
    }

    @RequestMapping(value = "/create/goods", method = RequestMethod.POST)
    public String create(MapGoods mapGoods) {
        return String.valueOf(digWriteService.createGoods(mapGoods));
    }

    @RequestMapping(value = "/create/map/data", method = RequestMethod.POST)
    public String create(  @RequestBody MapData obj, HttpServletResponse response) {
       return String.valueOf(digWriteService.createMapData(obj));

    }

    @RequestMapping(value = "/find/area",method = RequestMethod.GET)
    public List<MapArea> findAllArea(HttpServletResponse response) {
        return digReadService.findAllMapArea();
    }

    @RequestMapping(value = "/find/time", method = RequestMethod.GET)
    public List<MapTime> findAllTime() {
        return digReadService.findAllMapTime();
    }

    @RequestMapping(value = "/find/goods", method = RequestMethod.GET)
    public List<MapGoods> findAllGoods() {
        return digReadService.findAllMapGoods();
    }

    @RequestMapping(value = "/find/map/data", method = RequestMethod.GET)
    public List<MapData> findMapGoodsByPoint(int x, int y, int areaId) {
        return digReadService.findMapDataByPoint(x, y, areaId);
    }

    @RequestMapping(value = "/find/map/data/count")
    public Integer findMapDataCounts(HttpServletResponse response){
        return digReadService.findMapDataCounts();

    }


}
