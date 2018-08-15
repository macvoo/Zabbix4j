package com.zabbix4j.hostgroup;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Created by Suguru Yajima on 2014/06/04.
 */
@Data
@Accessors(chain = true)
public class HostgroupObject {

    private String groupid;
    private String name;
    private Integer flags;
    private Integer internal;

    public Integer getInternal() {
        return internal;
    }

    public void setInternal(Integer internal) {
        this.internal = internal;
    }

    public Integer getFlags() {
        return flags;
    }

    public void setFlags(Integer flags) {
        this.flags = flags;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGroupid() {
        return groupid;
    }

    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }

    public static enum ORIGN_HOST_GROUP {
        PLAIN(0), DISCOVERED(4);
        public int value;

        private ORIGN_HOST_GROUP(int value) {
            this.value = value;
        }
    }

    public static enum INTERNALLY {
        NOT_INTERNAL(0), INTERNAL(1);
        public int value;

        private INTERNALLY(int value) {
            this.value = value;
        }

    }
}
