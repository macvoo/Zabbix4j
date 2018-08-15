package com.zabbix4j.screenitem;

import com.zabbix4j.ZabbixApiResponse;
import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Suguru Yajima
 */
@Data
@Accessors(chain = true)
public class ScreenItemUpdateResponse extends ZabbixApiResponse {
    private Result result;

    public ScreenItemUpdateResponse() {
        super();
    }

    @Data
    @Accessors(chain = true)
    public class Result {

        private List<String> screenitemids;

    }
}
