package com.zabbix4j.hostprototype;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Created by Suguru Yajima on 2014/06/04.
 */
@Data
@Accessors(chain = true)
public class HostPrototypeObject {
    private String hostid;
    private String host;
    private String name;
    private Integer status;
    private String templateid;
}
