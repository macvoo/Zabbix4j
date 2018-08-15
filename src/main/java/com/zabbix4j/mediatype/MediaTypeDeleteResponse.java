package com.zabbix4j.mediatype;

import com.zabbix4j.ZabbixApiResponse;
import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Suguru Yajima
 */
@Data
@Accessors(chain = true)
public class MediaTypeDeleteResponse extends ZabbixApiResponse {
    private Result result;

    public MediaTypeDeleteResponse() {
        super();
    }

    @Data
    @Accessors(chain = true)
    public class Result {
        private List<String> mediatypeids;
    }
}
