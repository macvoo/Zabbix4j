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
    private List<Integer> params = new ArrayList<Integer>();

    public ScriptDeleteRequest() {
        setMethod("script.delete");
    }

    public void addScriptId(Integer id) {
        params.add(id);
        return this;
    }
}
