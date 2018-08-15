package com.zabbix4j.graphprototype;

import com.zabbix4j.ZabbixApiResponse;
import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Created by Suguru Yajima on 2014/06/02.
 */
@Data
@Accessors(chain = true)
public class GraphPrototypeCreateResponse extends ZabbixApiResponse {
    private Result result;

    public GraphPrototypeCreateResponse() {
        super();
    }

    public class Result {
        private List<Integer> graphids;

        public Result() {

        }

        public List<Integer> getGraphids() {
            return graphids;
        }

        public void setGraphids(List<Integer> graphids) {
            this.graphids = graphids;
        }
    }
}
