package com.zabbix4j.history;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * History objects differ depending on the item's type of information.</br>
 * They are created by the Zabbix server and cannot be modified via the API.
 * <p/>
 * Created by Suguru Yajima on 2014/06/03.
 */
@Data
@Accessors(chain = true)
public class HistoryObject {
    private String id;
    private Long clock;
    private String itemid;
    private Integer logeventid;
    private Integer ns;
    private Integer severity;
    private Integer source;
    private Long timestamp;
    private String value;

    public static enum HISOTRY_OBJECT_TYPE {
        FLOAT(0), STRING(1), LOG(2), INTEGER(3), TEXT(4);
        public int value;

        private HISOTRY_OBJECT_TYPE(int value) {
            this.value = value;
        }
    }
}
