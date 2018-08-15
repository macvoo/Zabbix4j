package com.zabbix4j.templatescreen;

import com.zabbix4j.ZabbixApiResponse;
import com.zabbix4j.host.HostObject;
import com.zabbix4j.screen.ScreenObject;
import com.zabbix4j.screenitem.ScreenItemObject;
import com.zabbix4j.template.TemplateObject;
import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Suguru Yajima
 */
@Data
@Accessors(chain = true)
public class TemplateScreenGetResponse extends ZabbixApiResponse {
    private List<Result> result;


    @Data
    @Accessors(chain = true)
    public class Result extends TemplateScreenObject {

        private List<ScreenItemObject> screenitems;
        private List<HostObject> hosts;
        private List<ScreenObject> screns;
        private List<TemplateObject> templates;
    }
}
