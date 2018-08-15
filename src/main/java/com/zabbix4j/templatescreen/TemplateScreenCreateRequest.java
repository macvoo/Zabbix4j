package com.zabbix4j.templatescreen;

import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.screenitem.ScreenItemObject;
import com.zabbix4j.utils.ZbxListUtils;
import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Suguru Yajima
 */
@Data
@Accessors(chain = true)
public class TemplateScreenCreateRequest extends ZabbixApiRequest {
    private Params params = new Params();

    public TemplateScreenCreateRequest() {
        setMethod("templatescreen.create");
    }

    @Data
    @Accessors(chain = true)
    public class Params extends TemplateScreenObject {

        private List<ScreenItemObject> screenitems;

        public Params addScreenItem(ScreenItemObject id) {
            screenitems = ZbxListUtils.add(screenitems, id);
            return this;
        }
    }
}
