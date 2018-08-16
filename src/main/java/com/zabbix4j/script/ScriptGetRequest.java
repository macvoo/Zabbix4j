package com.zabbix4j.script;

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
public class ScriptGetRequest extends ZabbixApiRequest {
    private Params params = new Params();

    public ScriptGetRequest() {
        setMethod("script.get");
    }

    @Data
    @Accessors(chain = true)
    public class Params extends GetRequestCommonParams {
        private List<String> groupids;
        private List<String> hostids;
        private List<String> scriptids;
        private List<String> usrgrpids;
        private String selectGroups;
        private String selectHosts;

        public Params addGroupid(final String id) {
            groupids = ZbxListUtils.add(groupids, id);
            return this;
        }

        public Params addHostid(final String id) {
            hostids = ZbxListUtils.add(hostids, id);
            return this;
        }

        public Params addScriptid(final String id) {
            scriptids = ZbxListUtils.add(scriptids, id);
            return this;
        }

        public Params addUsrGroupid(final String id) {
            usrgrpids = ZbxListUtils.add(usrgrpids, id);
            return this;
        }
    }
}
