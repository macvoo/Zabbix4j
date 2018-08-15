package com.zabbix4j.screen;

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
public class ScreenGetRequest extends ZabbixApiRequest {
    private Params params = new Params();

    public ScreenGetRequest() {
        setMethod("screen.get");
    }

    @Data
    @Accessors(chain = true)
    public class Params extends GetRequestCommonParams {
        private List<String> screenids;
        private List<String> screenitemids;
        private String selectScreenItems;

        public Params addScreenid(final String id) {
            screenids = ZbxListUtils.add(screenids, id);
            return this;
        }

        public Params addScreenItemid(final String id) {
            screenitemids = ZbxListUtils.add(screenitemids, id);
            return this;
        }
    }
}
