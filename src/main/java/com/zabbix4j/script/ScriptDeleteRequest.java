package com.zabbix4j.script;

import com.zabbix4j.ZabbixApiRequest;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Suguru Yajima
 */
@Data
@Accessors(chain = true)
public class ScriptDeleteRequest extends ZabbixApiRequest {
    private List<String> params = new ArrayList<String>();

    public ScriptDeleteRequest() {
        setMethod("script.delete");
    }

    public ScriptDeleteRequest addScriptid(final String id) {
        params.add(id);
        return this;
    }
}
