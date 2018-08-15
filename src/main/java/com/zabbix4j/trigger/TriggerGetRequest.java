/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 Suguru Yajima
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

package com.zabbix4j.trigger;

import com.zabbix4j.GetRequestCommonParams;
import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.utils.ZbxListUtils;
import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Created by Suguru Yajima on 2014/05/12.
 */
@Data
@Accessors(chain = true)
public class TriggerGetRequest extends ZabbixApiRequest {
    private Params params = new Params();

    public TriggerGetRequest() {
        setMethod("trigger.get");
    }

    @Data
    @Accessors(chain = true)
    public class Params extends GetRequestCommonParams {
        private List<Integer> triggerids;
        private List<Integer> groupids;
        private List<Integer> templateids;
        private List<Integer> hostids;
        private List<Integer> itemids;
        private List<Integer> applicationids;
        private List<String> functions;
        private String group;
        private String host;
        private String expandData;
        private Boolean expandDescription;
        private Boolean expandExpression;
        private String selectGroups;
        private String selectItems;
        private String selectHosts;
        private String selectFunctions;
        private String selectDependencies;
        private String selectDiscoveryRule;
        private String selectLastEvent;
        private String filter;

        public Params() {
            super();
        }

        public void addTriggerid(Integer id) {
            triggerids = ZbxListUtils.add(triggerids, id);
        }

        public void addGroupid(Integer id) {
            groupids = ZbxListUtils.add(groupids, id);
        }

        public void addTemplateid(Integer id) {
            templateids = ZbxListUtils.add(templateids, id);
        }

        public void addHostid(Integer id) {
            hostids = ZbxListUtils.add(hostids, id);
        }

        public void addItemid(Integer id) {
            itemids = ZbxListUtils.add(itemids, id);
        }

        public void addApplicationid(Integer id) {
            applicationids = ZbxListUtils.add(applicationids, id);
        }

        public Params addFunction(final String id) {
            functions = ZbxListUtils.add(functions, id);
            return this;
        }
    }
}
