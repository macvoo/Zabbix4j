package com.zabbix4j.lldrule;

import com.zabbix4j.ZabbixApiRequest;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Created by Suguru Yajima on 2014/06/06.
 */
@Data
@Accessors(chain = true)
public class LLDRuleCreateRequest extends ZabbixApiRequest {
    private Params params = new Params();

    public LLDRuleCreateRequest() {
        setMethod("discoveryrule.create");
    }

    @Data
    @Accessors(chain = true)
    public class Params extends LLDRuleObject {

    }
}
