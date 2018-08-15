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
public class ScriptCreateRequest extends ZabbixApiRequest {
    private List<ScriptObject> params = new ArrayList<ScriptObject>();

    public ScriptCreateRequest() {
        setMethod("script.create");
    }

    public ScriptCreateRequest addScriptObject(ScriptObject id) {
        params.add(id);
        return this;
    }
}
