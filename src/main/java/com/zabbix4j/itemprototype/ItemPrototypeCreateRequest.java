package com.zabbix4j.itemprototype;

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
public class ItemPrototypeCreateRequest extends ZabbixApiRequest {

    private Params params = new Params();

    public ItemPrototypeCreateRequest() {
        setMethod("itemprototype.create");
    }

    @Data
    @Accessors(chain = true)
    public class Params extends ItemPrototypeObject {

        private String ruleid;

        private List<String> applications;

        public Params addApplication(final String id) {
            applications = ZbxListUtils.add(applications, id);
            return this;
        }
    }
}
