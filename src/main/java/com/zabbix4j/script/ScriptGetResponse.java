package com.zabbix4j.script;

import com.zabbix4j.ZabbixApiResponse;
import com.zabbix4j.host.HostObject;
import com.zabbix4j.usergroup.UserGroupObject;
import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Suguru Yajima
 */
@Data
@Accessors(chain = true)
public class ScriptGetResponse extends ZabbixApiResponse {
    private List<Result> result;

    @Data
    @Accessors(chain = true)
    public class Result extends ScriptObject {

        private List<UserGroupObject> groups;
        private List<HostObject> hosts;
    }
}
