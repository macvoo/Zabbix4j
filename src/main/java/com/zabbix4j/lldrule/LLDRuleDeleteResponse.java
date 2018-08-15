package com.zabbix4j.lldrule;

import com.zabbix4j.ZabbixApiResponse;
import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Suguru Yajima
 */
@Data
@Accessors(chain = true)
public class LLDRuleDeleteResponse extends ZabbixApiResponse {
    private Result result;

    public LLDRuleDeleteResponse() {
    }

    @Data
    @Accessors(chain = true)
    public class Result {

        private List<String> ruleids;
    }
}
