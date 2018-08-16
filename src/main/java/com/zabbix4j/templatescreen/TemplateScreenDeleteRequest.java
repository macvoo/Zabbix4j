package com.zabbix4j.templatescreen;

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
public class TemplateScreenDeleteRequest extends ZabbixApiRequest {
    private List<String> params = new ArrayList<String>();

    public TemplateScreenDeleteRequest() {
        setMethod("templatescreen.delete");
    }

    public TemplateScreenDeleteRequest addTemplateScreenid(final String id) {
        params.add(id);
        return this;
    }
}
