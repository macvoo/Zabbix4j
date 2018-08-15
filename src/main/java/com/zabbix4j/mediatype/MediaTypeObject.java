package com.zabbix4j.mediatype;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Suguru Yajima
 */
@Data
@Accessors(chain = true)
public class MediaTypeObject {
    private String mediatypeid;
    private String description;
    private Integer type;
    private String exec_path;
    private String gsm_modem;
    private String passwd;
    private String smtp_email;
    private String smtp_helo;
    private String smtp_server;
    private Integer status;
    private String username;

    public static enum MEDIA_TYPE {
        EMAIL(0), SCRIPT(1), SMS(2), JABBER(3), EZ_TEXTING(100);
        public int value;

        private MEDIA_TYPE(int value) {
            this.value = value;
        }
    }

    public static enum MEDIA_STATUS {
        ENABLED(0), DISABLED(1);
        public int value;

        private MEDIA_STATUS(int value) {
            this.value = value;
        }
    }
}
