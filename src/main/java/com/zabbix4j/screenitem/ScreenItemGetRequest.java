package com.zabbix4j.screenitem;

import com.zabbix4j.GetRequestCommonParams;
import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.utils.ZbxListUtils;
import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Suguru Yajima
 */
@Data
@Accessors(chain = true)
public class ScreenItemGetRequest extends ZabbixApiRequest {
    private Params params = new Params();

    public ScreenItemGetRequest() {
        setMethod("screenitem.get");
    }

    @Data
    @Accessors(chain = true)
    public class Params extends GetRequestCommonParams {
        private List<String> screenitemids;
        private List<String> screenids;

        public void addScreenItemId(Integer id) {
            screenitemids = ZbxListUtils.add(screenitemids, id);
        }

        public void addScreenId(Integer id) {
            screenids = ZbxListUtils.add(screenids, id);
        }
    }
}
