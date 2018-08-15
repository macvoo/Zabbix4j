package com.zabbix4j.user;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Suguru Yajima
 */
@Data
@Accessors(chain = true)
public class UserObject {
    private String userid;
    private String alias;
    private Long attempt_clock;
    private Integer attempt_failed;
    private Integer autologin;
    private Integer autologout;
    private String lang;
    private String name;
    private Integer refresh;
    private Integer rows_per_page;
    private String surname;
    private String theme;
    private Integer type;
    private String url;

    public static enum AUTO_LOGIN {
        DISABLED(0), ENABLED(1);
        public int value;

        private AUTO_LOGIN(int value) {
            this.value = value;
        }
    }

    public static enum USER_TYPE {
        ZABBIX_USER(1), ZABBIX_ADMIN(2), ZABBIX_SUPER_ADMIN(3);
        public int value;

        private USER_TYPE(int value) {
            this.value = value;
        }
    }
}
