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
public class IconMapDeleteResponse extends ZabbixApiResponse {
    private Result result;

    public IconMapDeleteResponse() {
        super();
    }

    @Data
    @Accessors(chain = true)
    public class Result {

        private List<String> iconmapids;
    }
}
