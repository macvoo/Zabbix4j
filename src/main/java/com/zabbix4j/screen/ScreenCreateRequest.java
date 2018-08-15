package com.zabbix4j.screen;

import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.screenitem.ScreenItemObject;
import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Suguru Yajima
 */
@Data
@Accessors(chain = true)
public class ScreenCreateRequest extends ZabbixApiRequest {
    private Params params = new Params();

    public ScreenCreateRequest() {
        setMethod("screen.create");
    }
    public class Params extends ScreenObject {
        private List<ScreenItemObject> screenitems;
    }
}
