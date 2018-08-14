/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2018 Philipp Hana
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.zabbix4j.problem;

import com.zabbix4j.utils.ZbxListUtils;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

public class ProblemObject {

    @Accessors(chain = true)
    @Getter
    @Setter
    private Integer eventid;
    @Accessors(chain = true)
    @Getter
    @Setter
    private Integer source;
    @Accessors(chain = true)
    @Getter
    @Setter
    private Integer object;
    @Accessors(chain = true)
    @Getter
    @Setter
    private Integer objectid;
    @Accessors(chain = true)
    @Getter
    @Setter
    private Long clock;
    @Accessors(chain = true)
    @Getter
    @Setter
    private Long ns;
    @Accessors(chain = true)
    @Getter
    @Setter
    private Long r_eventid;
    @Accessors(chain = true)
    @Getter
    @Setter
    private Long r_clock;
    @Accessors(chain = true)
    @Getter
    @Setter
    private Long r_ns;
    @Accessors(chain = true)
    @Getter
    @Setter
    private Integer correlationid;
    @Accessors(chain = true)
    @Getter
    @Setter
    private Integer userid;
    @Accessors(chain = true)
    @Getter
    @Setter
    private String name;
    @Accessors(chain = true)
    @Getter
    @Setter
    private Integer acknowledged;
    @Accessors(chain = true)
    @Getter
    @Setter
    private Integer suppressed;
    @Accessors(chain = true)
    @Getter
    @Setter
    private Integer severtity;
    @Accessors(chain = true)
    @Getter
    @Setter
    private List<Acknowledge> acknowledges;
    @Accessors(chain = true)
    @Getter
    @Setter
    private List<Tag> tags;
    @Accessors(chain = true)
    @Getter
    @Setter
    private List<SuppressionData> suppression_data;


    public ProblemObject() {
    }

    public void addAcknowledges(Acknowledge id) {
        this.acknowledges = ZbxListUtils.add(this.acknowledges, id);
    }

    public void addTags(Tag id) {
        this.tags = ZbxListUtils.add(this.tags, id);
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

    private class Acknowledge {
        @Accessors(chain = true)
        @Getter
        @Setter
        private Integer acknowledgeid;
        @Accessors(chain = true)
        @Getter
        @Setter
        private Integer userid;
        @Accessors(chain = true)
        @Getter
        @Setter
        private Integer eventid;
        @Accessors(chain = true)
        @Getter
        @Setter
        private Long clock;
        @Accessors(chain = true)
        @Getter
        @Setter
        private String message;
        @Accessors(chain = true)
        @Getter
        @Setter
        private Integer action;
        @Accessors(chain = true)
        @Getter
        @Setter
        private Integer old_severity;
        @Accessors(chain = true)
        @Getter
        @Setter
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
        @Accessors(chain = true)
        @Getter
        @Setter
        private String tag;
        @Accessors(chain = true)
        @Getter
        @Setter
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
        @Accessors(chain = true)
        @Getter
        @Setter
        private String tag;
        @Accessors(chain = true)
        @Getter
        @Setter
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
        @Accessors(chain = true)
        @Getter
        @Setter
        private Integer maintenanceid;
        @Accessors(chain = true)
        @Getter
        @Setter
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
