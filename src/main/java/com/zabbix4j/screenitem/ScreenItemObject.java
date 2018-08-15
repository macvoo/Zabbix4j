package com.zabbix4j.screenitem;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Suguru Yajima
 */
@Data
@Accessors(chain = true)
public class ScreenItemObject {
    private String screenitemid;
    private Integer colspan;
    private Integer resourcetype;
    private Integer rowspan;
    private String screenid;
    private Integer elements;
    private Integer halign;
    private Integer height;
    private String resourceid;
    private Integer sort_triggers;
    private Integer style;
    private String url;
    private Integer valign;
    private Integer width;
    private Integer x;
    private Integer y;

    public static enum RESOURCE_TYPE {
        GRAPH(0), SIMPLE_GRAPH(1), MAP(2), PLAIN_TEXT(3), HOSTS_INFO(4), TRIGGERS_INFO(5), SERVER_INFO(6),
        CLOCK(7), SCREEN(8), TRIGGERS_OVERVIEW(9), DATA_OVERVIEW(10), URL(11), HISTORY_OF_ACTIONS(12),
        HISTORY_OF_EVENTS(13), STATUS_OF_HOST_GROUP_TRIGGERS(14), SYSTEM_STATUS(15), STATUS_OF_HOST_TRIGGERS(16);

        public int value;

        private RESOURCE_TYPE(int value) {
            this.value = value;
        }
    }

    public static enum HORIZONTAL_ALIGN {
        CENTER(0), LEFT(1), RIGHT(2);
        public int value;

        private HORIZONTAL_ALIGN(int value) {
            this.value = value;
        }
    }

    public static enum SORT_ORDER {
        TIME_ASCENDING(3), TYPE_ASCENDING(5), TYPE_DESCENDING(6), STATUS_ASCENDING(7), STATUS_DESCENDING(8),
        RETRIES_LEFT_ASCENDING(9), RETRIES_LEFT_DESCENDING(10), RECIPIENT_ASCENDING(11), RECIPIENT_DESCENDING(12),
        LAST_CHANGE_DESCENDING(0), SEVERITY_DESCENDING(1), HOST_ASCENDING(2);

        public int value;

        private SORT_ORDER(int value) {
            this.value = value;
        }
    }

    public static enum VERTICAL_ALIGN {
        CENTER(0), LEFT(1), RIGHT(2);
        public int value;

        private VERTICAL_ALIGN(int value) {
            this.value = value;
        }
    }
}
