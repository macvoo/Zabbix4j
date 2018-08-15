package com.zabbix4j.hostprototype;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * The group prototype object defines a group that will be created for a discovered host and has the following properties.
 * <p/>
 * Created by Suguru Yajima on 2014/06/04.
 */
@Data
@Accessors(chain = true)
public class GroupPrototypeObject {
    private String group_prototypeid;
    private String name;
    private String hostid;
    private String templateid;
}
