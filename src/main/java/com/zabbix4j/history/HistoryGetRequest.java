package com.zabbix4j.history;

import com.zabbix4j.GetRequestCommonParams;
import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.utils.ZbxListUtils;
import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Created by Suguru Yajima on 2014/06/03.
 */
@Data
@Accessors(chain = true)
public class HistoryGetRequest extends ZabbixApiRequest {
    private Params params = new Params();

    public HistoryGetRequest() {
        setMethod("history.get");
    }

    @Data
    @Accessors(chain = true)
    public class Params extends GetRequestCommonParams {
        private Integer history = HistoryObject.HISOTRY_OBJECT_TYPE.INTEGER.value;
        private List<Integer> hostids;
        private List<Integer> itemids;
        private Long time_from;
        private Long time_till;

        public void addHostId(Integer id) {
            hostids = ZbxListUtils.add(hostids, id);
        }

        public Params addItemid(final String id) {
            itemids = ZbxListUtils.add(hostids, id);
            return this;
        }
    }
}
