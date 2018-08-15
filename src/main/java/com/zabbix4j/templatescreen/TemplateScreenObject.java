package com.zabbix4j.templatescreen;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Suguru Yajima
 */
@Data
@Accessors(chain = true)
public class TemplateScreenObject {
    private String screenid;
    private String name;
    private String templateid;
    private Integer hsize;
    private Integer vsize;
}
