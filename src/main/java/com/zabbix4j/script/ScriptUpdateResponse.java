package com.zabbix4j.script;

import com.zabbix4j.ZabbixApiResponse;
import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Suguru Yajima
 */
@Data
@Accessors(chain = true)
public class ScriptUpdateResponse extends ZabbixApiResponse {
    private Result result;

    public ScriptUpdateResponse() {
        super();
    }

    @Data
    @Accessors(chain = true)
    public class Result {
        private List<String> scriptids;
    }
}
