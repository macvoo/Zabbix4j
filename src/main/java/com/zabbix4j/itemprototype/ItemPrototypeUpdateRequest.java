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
public class ItemPrototypeUpdateRequest extends ZabbixApiRequest {
    private Params params = new Params();

    public ItemPrototypeUpdateRequest() {
        setMethod("itemprototype.update");
    }

    @Data
    @Accessors(chain = true)
    public class Params extends ItemPrototypeObject {

        private List<Integer> applications;

        public Params addApplicationid(final Integer id) {
            applications = ZbxListUtils.add(applications, id);
            return this;
        }
    }
}
