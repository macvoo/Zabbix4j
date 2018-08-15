package com.zabbix4j.iconmap;

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
public class IconMapGetRequest extends ZabbixApiRequest {
    private Params params = new Params();

    public IconMapGetRequest() {
        setMethod("iconmap.get");
    }

    @Data
    @Accessors(chain = true)
    public class Params {
        private List<String> iconmapids;
        private List<String> sysmapids;
        private String selectMappings;

        public Params addIconMapid(String id) {
            iconmapids = ZbxListUtils.add(iconmapids, id);
            return this;
        }

        public Params addSystemid(String id) {
            sysmapids = ZbxListUtils.add(sysmapids, id);
            return this;
        }
    }
}
