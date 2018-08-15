package com.zabbix4j.script;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Suguru Yajima
 */
@Data
@Accessors(chain = true)
public class ScriptObject {
    private String scriptid;
    private String command;
    private String name;
    private String confirmation;
    private String description;
    private Integer execute_on;
    private String groupid;
    private Integer host_access;
    private Integer type;
    private String usrgrpid;

    public static enum EXECUTE_ON {
        ZABBIX_AGENT(0), ZABBIX_SERVER(1);
        public int value;

        private EXECUTE_ON(int value) {
            this.value = value;
        }
    }

    public static enum HOST_PERMISSION {
        READ(2), WRITE(3);
        public int value;

        private HOST_PERMISSION(int value) {
            this.value = value;
        }
    }
}
