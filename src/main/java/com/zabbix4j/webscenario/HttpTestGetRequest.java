package com.zabbix4j.webscenario;

import com.zabbix4j.GetRequestCommonParams;
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
public class HttpTestGetRequest extends ZabbixApiRequest {
    private Params params = new Params();

    public HttpTestGetRequest() {
        setMethod("httptest.get");
    }

    @Data
    @Accessors(chain = true)
    public class Params extends GetRequestCommonParams {
        private List<String> applicationids;
        private List<String> groupids;
        private List<String> hostids;
        private List<String> httptestids;
        private List<String> templateids;
        private Boolean inherited;
        private Boolean monitored;
        private Boolean templated;
        private Boolean expandName;
        private Boolean expandStepName;
        private String selectHosts;
        private String selectSteps;

        public Params addApplicationid(final String id) {
            applicationids = ZbxListUtils.add(applicationids, id);
            return this;
        }

        public Params addGroupid(final String id) {
            groupids = ZbxListUtils.add(groupids, id);
            return this;
        }

        public Params addHostid(final String id) {
            hostids = ZbxListUtils.add(hostids, id);
            return this;
        }

        public Params addHttpTestid(final String id) {
            httptestids = ZbxListUtils.add(httptestids, id);
            return this;
        }

        public Params addTemplateid(final String id) {
            templateids = ZbxListUtils.add(templateids, id);
            return this;
        }
    }
}
