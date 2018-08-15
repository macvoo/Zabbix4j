package com.zabbix4j.template;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Suguru Yajima
 */
@Data
@Accessors(chain = true)
public class TemplateObject {
    private String templateid;
    private String host;
    private String name;
}
