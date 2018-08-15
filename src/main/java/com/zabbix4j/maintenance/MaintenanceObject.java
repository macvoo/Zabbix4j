package com.zabbix4j.maintenance;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Suguru Yajima
 */
@Data
@Accessors(chain = true)
public class MaintenanceObject {
    private String maintenanceid;
    private String name;
    private Long active_since;
    private Long active_till;
    private String description;
    private Integer maintenance_type;
    private Integer tags_evaltype;

    public static enum MAINTENANCE_TYPE {
        WITH_DATA_COLLECTION(0), WITHOUT_DATA_COLLECTION(1);
        public int value;

        private MAINTENANCE_TYPE(int value) {
            this.value = value;
        }
    }
}
