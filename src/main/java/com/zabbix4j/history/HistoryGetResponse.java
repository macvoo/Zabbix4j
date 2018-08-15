package com.zabbix4j.history;

import com.zabbix4j.ZabbixApiResponse;
import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Created by Suguru Yajima on 2014/06/03.
 */
@Data
@Accessors(chain = true)
public class HistoryGetResponse extends ZabbixApiResponse {
    private List<HistoryObject> result;

}
