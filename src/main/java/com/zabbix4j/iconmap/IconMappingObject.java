package com.zabbix4j.iconmap;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Suguru Yajima
 */
@Data
@Accessors(chain = true)
public class IconMappingObject {
    private String iconmappingid;
    private String iconid;
    private String expression;
    private Integer inventory_link;
    private Integer iconmapid;
    private Integer sortorder;
}
