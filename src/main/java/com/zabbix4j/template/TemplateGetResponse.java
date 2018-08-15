package com.zabbix4j.template;

import com.zabbix4j.ZabbixApiResponse;
import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Suguru Yajima
 */
@Data
@Accessors(chain = true)
public class TemplateGetResponse extends ZabbixApiResponse {
    private List<Result> result;


    @Data
    @Accessors(chain = true)
    public class Result extends TemplateObject {

    }
}
