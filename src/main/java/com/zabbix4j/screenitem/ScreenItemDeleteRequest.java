package com.zabbix4j.screenitem;

import com.zabbix4j.ZabbixApiRequest;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Suguru Yajima
 */
@Data
@Accessors(chain = true)
public class ScreenItemDeleteRequest extends ZabbixApiRequest {
    private List<Integer> params = new ArrayList<Integer>();

    public ScreenItemDeleteRequest() {
        setMethod("screenitem.delete");
    }

    public void addScreenItemId(Integer id) {
        params.add(id);
    }
}
