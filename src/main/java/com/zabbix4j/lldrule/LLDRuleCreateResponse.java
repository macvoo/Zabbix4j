package com.zabbix4j.lldrule;

import com.zabbix4j.ZabbixApiResponse;
import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Created by Suguru Yajima on 2014/06/06.
 */
@Data
@Accessors(chain = true)
public class LLDRuleCreateResponse extends ZabbixApiResponse {
    private Result result;

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
