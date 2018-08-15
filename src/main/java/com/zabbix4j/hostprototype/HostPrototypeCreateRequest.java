package com.zabbix4j.hostprototype;

import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.utils.ZbxListUtils;
import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Created by Suguru Yajima on 2014/06/04.
 */
@Data
@Accessors(chain = true)
public class HostPrototypeCreateRequest extends ZabbixApiRequest {
    private Params params = new Params();

    public HostPrototypeCreateRequest() {
        setMethod("hostprototype.create");
    }

    @Data
    @Accessors(chain = true)
    public class Params extends HostPrototypeObject {
        private List<GroupLinkObject> groupLinks;
        private String ruleid;
        private List<GroupPrototypeObject> groupPrototypes;
        private HostPrototypeInventoryObject inventory;
        private List<Integer> templates;

        public Params addGroupPrototype(GroupPrototypeObject id) {
            groupPrototypes = ZbxListUtils.add(groupPrototypes, id);
            return this;
        }

        public Params addGroupLink(GroupLinkObject id) {
            groupLinks = ZbxListUtils.add(groupLinks, id);
            return this;
        }
    }
}
