package com.zabbix4j.iconmap;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Suguru Yajima
 */
@Data
@Accessors(chain = true)
public class IconMapObject {
    private Integer iconmapid;
    private Integer default_iconid;
    private String name;
}
