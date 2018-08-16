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
public class ScriptCreateResponse extends ZabbixApiResponse {
    private Result result;

    public ScriptCreateResponse() {
        super();
    }

    @Data
    @Accessors(chain = true)
    public class Result {
        private List<String> scriptids;


    }
}
