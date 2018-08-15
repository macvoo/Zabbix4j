package com.zabbix4j.templatescreenitem;

import com.zabbix4j.ZabbixApiResponse;
import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Suguru Yajima
 */
@Data
@Accessors(chain = true)
public class TemplateScreenItemGetResponse extends ZabbixApiResponse {
    private List<TemplateScreenItemObject> result;

}
