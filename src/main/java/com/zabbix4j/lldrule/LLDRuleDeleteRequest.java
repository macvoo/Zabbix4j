package com.zabbix4j.lldrule;

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
public class LLDRuleDeleteRequest extends ZabbixApiRequest {

    private List<Integer> params;

    public LLDRuleDeleteRequest() {
        setMethod("discoveryrule.delete");
    }

    public LLDRuleDeleteRequest addRuleid(final String id) {
        params = ZbxListUtils.add(params, id);
        return this;
    }
}
