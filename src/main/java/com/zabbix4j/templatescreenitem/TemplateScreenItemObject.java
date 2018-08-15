package com.zabbix4j.templatescreenitem;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Suguru Yajima
 */
@Data
@Accessors(chain = true)
public class TemplateScreenItemObject {
    private String screenitemid;
    private Integer colspan;
    private String resourceid;
    private Integer resourcetype;
    private Integer rowspan;
    private Integer elements;
    private String screenid;
    private Integer halign;
    private Integer height;
    private Integer style;
    private String url;
    private Integer valign;
    private Integer width;
    private Integer x;
    private Integer y;

    public static enum RESOURCE_TYPE {
        GRAPH(0), SIMPLE_GRAPH(1), PLAIN_TEXT(3), CLOCK(7), URL(11);
        public int value;

        private RESOURCE_TYPE(int value) {
            this.value = value;
        }
    }

    public static enum HALIGH {
        CENTER(0), LEFT(1), RIGHT(2);
        public int value;

        private HALIGH(int value) {
            this.value = value;
        }
    }

    public static enum CLOCK_STYLE {
        LOCAL_TIME(0), SERVER_TIME(1), HOST_TIME(2);
        public int value;

        private CLOCK_STYLE(int value) {
            this.value = value;
        }
    }

    public static enum PLAIN_TEXT_STYLE {
        PLAIN_TEXT(0), HTML(1);
        public int value;

        private PLAIN_TEXT_STYLE(int value) {
            this.value = value;
        }
    }

    public static enum VALIGN {
        MIDDLE(0), TOP(1), BOTTOM(2);
        public int value;

        private VALIGN(int value) {
            this.value = value;
        }

    }
}
