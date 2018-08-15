package com.zabbix4j.templatescreen;

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
public class TemplateScreenUpdateRequest extends ZabbixApiRequest {
    private Params params = new Params();

    public TemplateScreenUpdateRequest() {
        setMethod("templatescreen.update");
    }

    @Data
    @Accessors(chain = true)
    public class Params extends TemplateScreenObject {
        private List<ScreenItemObject> screenitems;
    }
}
