package com.zabbix4j.triggerprototype;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Suguru Yajima
 */
@Data
@Accessors(chain = true)
public class TriggerPrototypeObject {
    private String triggerid;
    private String description;
    private String expression;
    private String comments;
    private Integer priority;
    private Integer status;
    private String templateid;
    private Integer type;
    private String url;

    public static enum SERVERITY {
        NOT_CLASSIFIED(0), INFORMATION8(1), WARNING(2), AVERAGE(3), HIGH(4), DISASTER(5);
        public int value;

        private SERVERITY(int value) {
            this.value = value;
        }
    }

    public static enum STATUS {
        ENABLED(0), DISABLED(1);
        public int value;

        private STATUS(int value) {
            this.value = value;
        }
    }

    public static enum GENERATE_TYPE {
        DO_NOT_GENERATE_MULTIPLE_EVENTS(0), GENERATE_MULTIPLE_EVENTS(1);
        public int value;

        private GENERATE_TYPE(int value) {
            this.value = value;
        }
    }
}
