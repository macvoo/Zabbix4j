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
    private List<Integer> params = new ArrayList<Integer>();

    public TemplateDeleteRequest() {
        setMethod("template.delete");
    }

    public void addTemplateId(Integer id) {
        params.add(id);
        return this;
    }
}
