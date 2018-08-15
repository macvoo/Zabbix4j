package com.zabbix4j.screen;

import com.zabbix4j.ZabbixApiResponse;
import com.zabbix4j.screenitem.ScreenItemObject;
import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Suguru Yajima
 */
@Data
@Accessors(chain = true)
public class ScreenGetResponse extends ZabbixApiResponse {
    private List<Result> result;

    @Data
    @Accessors(chain = true)
    public class Result extends ScreenObject {
        private List<ScreenItemObject> screenitems;
    }
}
