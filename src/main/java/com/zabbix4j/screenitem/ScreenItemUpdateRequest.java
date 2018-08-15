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
public class ScreenItemUpdateRequest extends ZabbixApiRequest {
    private List<ScreenItemObject> params = new ArrayList<ScreenItemObject>();

    public ScreenItemUpdateRequest() {
        setMethod("screenitem.update");
    }

    public void addScreenItem(ScreenItemObject obj) {
        params.add(obj);
    }
}
