package com.zabbix4j.webscenario;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Suguru Yajima
 */
@Data
@Accessors(chain = true)
public class WebScenarioObject {

    private String httptestid;
    private String hostid;
    private String name;
    private String agent;
    private String applicationid;
    private Integer authentication;
    private String delay;
    private String http_password;
    private String http_proxy;
    private String http_user;
    private Long nextcheck;
    private Integer retries;
    private Integer status;
    private String templateid;
    private String variables;
    private String url;

    public static enum AUTHENTICATION_METHOD {
        NONE(0), BASCI_HTTP(1), NTLM(2);
        private int value;

        private AUTHENTICATION_METHOD(int value) {
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
}
