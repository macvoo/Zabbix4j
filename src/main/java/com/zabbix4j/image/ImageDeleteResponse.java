package com.zabbix4j.image;

import com.zabbix4j.ZabbixApiResponse;
import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Suguru Yajima
 */
@Data
@Accessors(chain = true)
public class ImageDeleteResponse extends ZabbixApiResponse {
    private Result result;

    public ImageDeleteResponse() {
        super();
    }

    @Data
    @Accessors(chain = true)
    public class Result {
        private List<String> imageids;
    }
}
