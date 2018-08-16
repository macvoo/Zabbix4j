package com.zabbix4j.hostprototype;

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
public class HostPrototypeUpdateRequest extends ZabbixApiRequest {
    private Params params = new Params();

    public HostPrototypeUpdateRequest() {
        setMethod("hostprototype.update");
    }

    @Data
    @Accessors(chain = true)
    public class Params extends HostPrototypeObject {

        private List<GroupLinkObject> groupLinks;
        private List<GroupPrototypeObject> groupPrototypes;
        private HostPrototypeInventoryObject inventory;
        private List<Integer> templates;

        public Params addGroupLink(GroupLinkObject id) {
            groupLinks = ZbxListUtils.add(groupLinks, id);
            return this;
        }

        public Params addGroupPrototype(GroupPrototypeObject id) {
            groupPrototypes = ZbxListUtils.add(groupPrototypes, id);
            return this;
        }

        public Params addTemplate(final Integer id) {
            templates = ZbxListUtils.add(templates, id);
            return this;
        }
    }
}
