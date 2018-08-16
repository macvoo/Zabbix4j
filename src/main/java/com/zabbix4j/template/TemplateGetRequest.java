package com.zabbix4j.template;

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
public class TemplateGetRequest extends ZabbixApiRequest {
    private Params params = new Params();

    public TemplateGetRequest() {
        setMethod("template.get");
    }

    @Data
    @Accessors(chain = true)
    public class Params extends GetRequestCommonParams {

        private List<String> templateids;
        private List<String> groupids;
        private List<String> parentTemplateids;
        private List<String> hostids;
        private List<String> graphids;
        private List<String> itemids;
        private List<String> triggerIds;
        private Boolean with_items;
        private Boolean with_triggers;
        private Boolean with_graphs;
        private Boolean with_httptests;

        public Params addTemplateid(final String id) {
            templateids = ZbxListUtils.add(templateids, id);
            return this;
        }

        public Params addGroupid(final String id) {
            groupids = ZbxListUtils.add(groupids, id);
            return this;
        }

        public Params addParentTemplateid(final String id) {
            parentTemplateids = ZbxListUtils.add(parentTemplateids, id);
            return this;
        }

        public Params addHostid(final String id) {
            hostids = ZbxListUtils.add(hostids, id);
            return this;
        }

        public Params addGraphid(final String id) {
            graphids = ZbxListUtils.add(graphids, id);
            return this;
        }

        public Params addItemid(final String id) {
            itemids = ZbxListUtils.add(itemids, id);
            return this;
        }

        public Params addTriggerid(final String id) {
            triggerIds = ZbxListUtils.add(triggerIds, id);
            return this;
        }
    }
}
