package com.zabbix4j.problem;

import com.zabbix4j.GetRequestCommonParams;
import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.utils.ZbxListUtils;
import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ProblemGetRequest extends ZabbixApiRequest {
    private Params params = new Params();

    public ProblemGetRequest() {
        this.setMethod("problem.get");
    }

    @Data
    @Accessors(chain = true)
    public class Params extends GetRequestCommonParams {

        private List<String> eventids;
        private List<String> groupids;
        private List<String> hostids;
        private List<String> objectids;
        private List<String> applicationids;
        private Integer source;
        private Integer object;
        private boolean acknowledged;
        private List<Integer> severities;
        private Integer evaltype;
        private String tags;
        private boolean recent;
        private String eventid_from;
        private String eventid_till;
        private Long time_from;
        private Long time_till;
        private String selectAcknowledges;
        private String selectTags;
        private String selectSuppressionData;

        public Params addObjectid(final String id) {
            this.objectids = ZbxListUtils.add(this.objectids, id);
            return this;
        }

        public Params addApplicationid(final String id) {
            this.applicationids = ZbxListUtils.add(this.applicationids, id);
            return this;
        }

        public Params addEventid(final String id) {
            this.eventids = ZbxListUtils.add(this.eventids, id);
            return this;
        }

        public Params addGroupid(final String id) {
            this.groupids = ZbxListUtils.add(this.groupids, id);
            return this;
        }

        public Params addHostid(final String id) {
            this.hostids = ZbxListUtils.add(this.hostids, id);
            return this;
        }

        public Params addSeverities(final Integer id) {
            this.severities = ZbxListUtils.add(this.severities, id);
            return this;
        }
    }
}
