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
public class IconMapCreateRequest extends ZabbixApiRequest {
    private Params params = new Params();

    public IconMapCreateRequest() {
        setMethod("iconmap.create");
    }

    @Data
    @Accessors(chain = true)
    public class Params extends IconMapObject {

        private List<IconMappingObject> mappings;

        public Params addMapping(IconMappingObject id) {
            mappings = ZbxListUtils.add(mappings, id);
            return this;
        }
    }
}
