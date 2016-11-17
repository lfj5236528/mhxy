package map.model;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by liangfujie on 16/11/10
 */
@Data
@Component
public class MapGoods {
    private Long id;
    private String name;
    private Integer goodsLevel;
    private String imageUrl;
    private String extraJson;
    private Date createdAt;
    private Date updatedAt;
}
