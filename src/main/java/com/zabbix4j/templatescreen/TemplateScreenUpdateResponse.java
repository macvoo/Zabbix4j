package com.zabbix4j.templatescreen;

import com.zabbix4j.ZabbixApiResponse;
import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Suguru Yajima
 */
@Data
@Accessors(chain = true)
public class TemplateScreenUpdateResponse extends ZabbixApiResponse {
    private Result result;

    public TemplateScreenUpdateResponse() {
        super();
    }

    @Data
    @Accessors(chain = true)
    public class Result {
        private List<String> screenids;

    }
}
