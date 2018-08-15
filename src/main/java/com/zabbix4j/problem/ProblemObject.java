package com.zabbix4j.problem;

import com.zabbix4j.utils.ZbxListUtils;
import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ProblemObject {

    private String eventid;
    private Integer source;
    private Integer object;
    private String objectid;
    private Long clock;
    private Long ns;
    private Long r_eventid;
    private Long r_clock;
    private Long r_ns;
    private Integer correlationid;
    private String userid;
    private String name;
    private Integer acknowledged;
    private Integer suppressed;
    private Integer severtity;
    private List<Acknowledge> acknowledges;
    private List<Tag> tags;
    private List<SuppressionData> suppression_data;

    public ProblemObject() {
    }

    public ProblemObject addAcknowledges(Acknowledge id) {
        this.acknowledges = ZbxListUtils.add(this.acknowledges, id);
        return this;
    }

    public ProblemObject addTags(Tag id) {
        this.tags = ZbxListUtils.add(this.tags, id);
        return this;
    }

    public void addSuppression_data(SuppressionData id) {
        this.suppression_data = ZbxListUtils.add(this.suppression_data, id);
    }

    @Override
    public String toString() {
        return "ProblemObject{"
               + " eventid=" + eventid
               + ", source=" + source
               + ", object=" + object
               + ", objectid=" + objectid
               + ", clock=" + clock
               + ", ns=" + ns
               + ", r_eventid=" + r_eventid
               + ", r_clock=" + r_clock
               + ", r_ns=" + r_ns
               + ", correlationid=" + correlationid
               + ", userid=" + userid
               + ", name='" + name + '\''
               + ", acknowledged=" + acknowledged
               + ", suppressed=" + suppressed
               + ", severtity=" + severtity
               + ", acknowledges=" + acknowledges
               + ", tags=" + tags
               + ", suppression_data=" + suppression_data
               + '}';
    }

    @Data
    @Accessors(chain = true)
    private class Acknowledge {

        private Integer acknowledgeid;

        private String userid;

        private String eventid;

        private Long clock;

        private String message;

        private Integer action;

        private Integer old_severity;

        private Integer new_severity;

        @Override
        public String toString() {
            return "Acknowledge{"
                   + " acknowledgeid=" + acknowledgeid
                   + ", userid=" + userid
                   + ", eventid=" + eventid
                   + ", clock=" + clock
                   + ", message='" + message + '\''
                   + ", action=" + action
                   + ", old_severity=" + old_severity
                   + ", new_severity=" + new_severity
                   + '}';
        }
    }

    private class Tag {

        private String tag;

        private String value;

        @Override
        public String toString() {
            return "Tag{"
                   + " tag='" + tag + '\''
                   + ", value='" + value + '\''
                   + '}';
        }
    }

    private class suppression_data {

        private String tag;

        private String value;

        @Override
        public String toString() {
            return "suppression_data{"
                   + " tag='" + tag + '\''
                   + ", value='" + value + '\''
                   + '}';
        }
    }

    private class SuppressionData {

        private Integer maintenanceid;

        private Long suppress_until;

        @Override
        public String toString() {
            return "SuppressionData{"
                   + " maintenanceid=" + maintenanceid
                   + ", suppress_until=" + suppress_until
                   + '}';
        }
    }
}
