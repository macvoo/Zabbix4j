package com.zabbix4j.hostprototype;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * The group link object links a host prototype with a host group and has the following properties.
 * <p/>
 * Created by Suguru Yajima on 2014/06/04.
 */
@Data
@Accessors(chain = true)
public class GroupLinkObject {

    private String group_prototypeid;
    private String groupid;
    private String hostid;
    private String templateid;
}
