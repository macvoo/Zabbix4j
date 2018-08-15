package com.zabbix4j.webscenario;

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
public class HttpTestUpdateRequest extends ZabbixApiRequest {
    private Params params = new Params();

    public HttpTestUpdateRequest() {
        setMethod("httptest.update");
    }

    @Data
    @Accessors(chain = true)
    public class Params extends WebScenarioObject {
        private List<ScenarioStepObject> steps;

        public Params addScenarioStepObject(ScenarioStepObject id) {
            steps = ZbxListUtils.add(steps, id);
            return this;
        }
    }
}
