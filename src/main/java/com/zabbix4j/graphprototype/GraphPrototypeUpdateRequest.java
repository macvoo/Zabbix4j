package com.zabbix4j.graphprototype;

import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.graph.GraphItem;
import com.zabbix4j.utils.ZbxListUtils;
import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Created by Suguru Yajima on 2014/06/02.
 */
@Data
@Accessors(chain = true)
public class GraphPrototypeUpdateRequest extends ZabbixApiRequest {
    private Params params = new Params();

    public GraphPrototypeUpdateRequest() {
        setMethod("graphprototype.update");
    }

    @Data
    @Accessors(chain = true)
    public class Params extends GraphPrototypeObject {
        private List<GraphItem> gitems;

        public Params addGraphItem(GraphItem gitem) {
            gitems = ZbxListUtils.add(gitems, gitem);
            return this;
        }
    }
}
