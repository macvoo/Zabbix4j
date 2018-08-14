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

import com.zabbix4j.GetRequestCommonParams;
import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.utils.ZbxListUtils;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

public class ProblemGetRequest extends ZabbixApiRequest {
    private com.zabbix4j.problem.ProblemGetRequest.Params params = new com.zabbix4j.problem.ProblemGetRequest.Params();

    public ProblemGetRequest() {
        this.setMethod("problem.get");
    }

    public com.zabbix4j.problem.ProblemGetRequest.Params getParams() {
        return this.params;
    }

    public void setParams(com.zabbix4j.problem.ProblemGetRequest.Params params) {
        this.params = params;
    }

    public class Params extends GetRequestCommonParams {
        @Accessors(chain = true)
        @Getter
        @Setter
        private List<Integer> eventids;
        @Accessors(chain = true)
        @Getter
        @Setter
        private List<Integer> groupids;
        @Accessors(chain = true)
        @Getter
        @Setter
        private List<Integer> hostids;
        @Accessors(chain = true)
        @Getter
        @Setter
        private List<Integer> objectids;
        @Accessors(chain = true)
        @Getter
        @Setter
        private List<Integer> applicationids;

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
        private boolean acknowledged;
        @Accessors(chain = true)
        @Getter
        @Setter
        private List<Integer> severities;
        @Accessors(chain = true)
        @Getter
        @Setter
        private Integer evaltype;
        @Accessors(chain = true)
        @Getter
        @Setter
        private String tags;
        @Accessors(chain = true)
        @Getter
        @Setter
        private boolean recent;
        @Setter
        private String eventid_from;
        @Accessors(chain = true)
        @Getter
        @Setter
        private String eventid_till;
        @Accessors(chain = true)
        @Getter
        @Setter
        private Long time_from;
        @Accessors(chain = true)
        @Getter
        @Setter
        private Long time_till;
        @Accessors(chain = true)
        @Getter
        @Setter
        private String selectAcknowledges;
        @Accessors(chain = true)
        @Getter
        @Setter
        private String selectTags;
        @Accessors(chain = true)
        @Getter
        @Setter
        private String selectSuppressionData;

        public Params() {
        }

        public void addObjectId(Integer id) {
            this.objectids = ZbxListUtils.add(this.objectids, id);
        }

        public void addApplicationId(Integer id) {
            this.applicationids = ZbxListUtils.add(this.applicationids, id);
        }

        public void addEventId(Integer id) {
            this.eventids = ZbxListUtils.add(this.eventids, id);
        }

        public void addGroupId(Integer id) {
            this.groupids = ZbxListUtils.add(this.groupids, id);
        }

        public void addHostId(Integer id) {
            this.hostids = ZbxListUtils.add(this.hostids, id);
        }

        public void addSeverities(Integer id) {
            this.severities = ZbxListUtils.add(this.severities, id);
        }
    }
}
