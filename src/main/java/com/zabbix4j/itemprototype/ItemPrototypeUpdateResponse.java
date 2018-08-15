package com.zabbix4j.itemprototype;

import com.zabbix4j.ZabbixApiResponse;
import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Suguru Yajima
 */
@Data
@Accessors(chain = true)
public class ItemPrototypeUpdateResponse extends ZabbixApiResponse {
    private Result result;

    public ItemPrototypeUpdateResponse() {
        super();
    }

    @Data
    @Accessors(chain = true)
    public class Result {
        private List<Integer> itemids;

        /**
         * Gets itemids.
         *
         * @return Value of itemids.
         */
        public List<Integer> getItemids() {
            return itemids;
        }

        /**
         * Sets new itemids.
         *
         * @param itemids New value of itemids.
         */
        public void setItemids(List<Integer> itemids) {
            this.itemids = itemids;
        }
    }
}
