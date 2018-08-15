package com.zabbix4j.webscenario;

import com.zabbix4j.ZabbixApiResponse;
import com.zabbix4j.host.HostObject;
import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Suguru Yajima
 */
@Data
@Accessors(chain = true)
public class HttpTestGetResponse extends ZabbixApiResponse {
    private List<Result> result;

    @Data
    @Accessors(chain = true)
    public class Result extends WebScenarioObject {

        private List<ScenarioStepObject> steps;
        private List<HostObject> hosts;
    }
}
