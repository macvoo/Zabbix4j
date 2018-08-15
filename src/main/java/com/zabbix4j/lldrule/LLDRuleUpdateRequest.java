package com.zabbix4j.lldrule;

import com.zabbix4j.ZabbixApiRequest;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Suguru Yajima
 */
@Data
@Accessors(chain = true)
public class LLDRuleUpdateRequest extends ZabbixApiRequest {
    private Params params = new Params();

    public LLDRuleUpdateRequest() {
        setMethod("discoveryrule.update");
    }

    @Data
    @Accessors(chain = true)
    public class Params extends LLDRuleObject {

    }
}
