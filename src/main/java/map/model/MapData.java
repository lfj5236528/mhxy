package map.model;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by liangfujie on 16/11/10
 */
@Data
@Component
public class MapData implements Serializable {
    private static final long serialVersionUID = -7607086156307162043L;
    private Long id;
    private String area;
    private Integer areaId;
    private Integer pointX;
    private Integer pointY;
    private String goods;
    private Long goodsId;
    private String time;
    private Integer timeId;
    private String extraJson;
    private Date createdAt;
    private Date updatedAt;
}
