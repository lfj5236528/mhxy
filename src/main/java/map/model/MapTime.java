package map.model;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by liangfujie on 16/11/10
 */
@Data
@Component
public class MapTime {
    private Integer id;
    private String name;
    private String extraJson;
    private Date createdAt;
    private Date updatedAt;


}
