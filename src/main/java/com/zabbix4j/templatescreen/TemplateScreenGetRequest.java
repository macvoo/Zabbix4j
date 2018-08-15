package com.zabbix4j.templatescreen;

import com.zabbix4j.GetRequestCommonParams;
import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.utils.ZbxListUtils;
import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Suguru Yajima
 */
@Data
@Accessors(chain = true)
public class TemplateScreenGetRequest extends ZabbixApiRequest {
    private Params params = new Params();

    public TemplateScreenGetRequest() {
        setMethod("templatescreen.get");
    }

    @Data
    @Accessors(chain = true)
    public class Params extends GetRequestCommonParams {
        private List<String> hostids;
        private List<String> screenids;
        private List<String> screenitemids;
        private List<String> templateids;
        private Boolean noInheritance;
        private String selectScreenItems;

        public Params addHostid(final String id) {
            hostids = ZbxListUtils.add(hostids, id);
            return this;
        }

        public Params addScreenid(final String id) {
            screenids = ZbxListUtils.add(screenids, id);
            return this;
        }

        public Params addScreenItemid(final String id) {
            screenitemids = ZbxListUtils.add(screenitemids, id);
            return this;
        }

        public Params addTemplateid(final String id) {
            templateids = ZbxListUtils.add(templateids, id);
            return this;
        }
    }
}
