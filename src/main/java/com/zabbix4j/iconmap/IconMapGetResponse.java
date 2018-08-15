package com.zabbix4j.iconmap;

import com.zabbix4j.ZabbixApiResponse;
import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Suguru Yajima
 */
@Data
@Accessors(chain = true)
public class IconMapGetResponse extends ZabbixApiResponse {

    private List<Result> result;

    @Data
    @Accessors(chain = true)
    public class Result extends IconMapObject {

        private List<IconMappingObject> mappings;
    }
}
