package com.zabbix4j.screen;

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
public class ScreenDeleteRequest extends ZabbixApiRequest {
    private List<String> params = new ArrayList<String>();

    public ScreenDeleteRequest() {
        setMethod("screen.delete");
    }

    public ScreenDeleteRequest addScreenid(final String id) {
        params.add(id);
        return this;
    }
}
