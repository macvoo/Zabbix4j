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
public class ScreenItemGetResponse extends ZabbixApiResponse {
    private List<ScreenItemObject> result;

}
