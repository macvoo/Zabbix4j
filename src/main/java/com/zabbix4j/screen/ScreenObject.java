package com.zabbix4j.screen;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Suguru Yajima
 */
@Data
@Accessors(chain = true)
public class ScreenObject {
    private String screenid;
    private String name;
    private Integer hsize;
    private Integer vsize;
}
