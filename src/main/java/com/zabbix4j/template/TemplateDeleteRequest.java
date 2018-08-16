package com.zabbix4j.template;

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
public class TemplateDeleteRequest extends ZabbixApiRequest {
    private List<String> params = new ArrayList<String>();

    public TemplateDeleteRequest() {
        setMethod("template.delete");
    }

    public TemplateDeleteRequest addTemplateid(final String id) {
        params.add(id);
        return this;
    }
}
