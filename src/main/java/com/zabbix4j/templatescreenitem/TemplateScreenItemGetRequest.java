package com.zabbix4j.templatescreenitem;

import com.zabbix4j.GetRequestCommonParams;
import com.zabbix4j.ZabbixApiRequest;
import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Suguru Yajima
 */
@Data
@Accessors(chain = true)
public class TemplateScreenItemGetRequest extends ZabbixApiRequest {
    private Params params = new Params();

    public TemplateScreenItemGetRequest() {
        setMethod("templatescreenitem.get");
    }

    @Data
    @Accessors(chain = true)
    public class Params extends GetRequestCommonParams {

        private List<String> screenids;
        private List<String> screenitemids;
        private List<String> hostids;
    }
}
