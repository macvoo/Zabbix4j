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

package com.zabbix4j.hostgroup;

import com.zabbix4j.GetRequestCommonParams;
import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.utils.ZbxListUtils;
import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Created by Suguru Yajima on 2014/04/27.
 */
@Data
@Accessors(chain = true)
public class HostgroupGetRequest extends ZabbixApiRequest {
    private Params params = new Params();

    public HostgroupGetRequest() {
        setMethod("hostgroup.get");
    }

    @Data
    @Accessors(chain = true)
    public class Params extends GetRequestCommonParams {

        private List<String> graphids;

        private List<String> groupids;

        private List<String> hostids;

        private List<String> maintenanceids;

        private List<String> templateids;

        private List<String> triggerIds;

        private Boolean monitored_hosts;

        private Boolean not_proxy_hosts;

        private Boolean real_hosts;

        private Boolean templated_hosts;

        private Boolean with_applications;

        private Boolean with_graphs;

        private Boolean with_hosts_and_templates;

        private Boolean with_httptests;

        private Boolean with_items;

        private Boolean with_monitored_httptests;

        private Boolean with_monitored_items;

        private Boolean with_monitored_triggers;

        private Boolean with_simple_graph_items;

        private Boolean with_triggers;

        private String selectDiscoveryRule;
        /**
         * Return the host group discovery object in the groupDiscovery property.
         * <p/>
         * The host group discovery object links a discovered host group to a host group prototype and has the following properties:
         * groupid - (string) ID of the discovered host group;
         * lastcheck - (timestamp) time when the host group was last discovered;
         * name - (string) name of the host goup prototype;
         * parent_group_prototypeid - (string) ID of the host group prototype from which the host group has been created;
         * ts_delete - (timestamp) time when a host group that is no longer discovered will be deleted.
         */

        private String selectGroupDiscovery;

        private String selectHosts;

        private String selectTemplates;

        private Filter filter;

        public Params addGraphid(final String id) {
            graphids = ZbxListUtils.add(graphids, id);
            return this;
        }

        public Params addGroupid(final String id) {
            groupids = ZbxListUtils.add(groupids, id);
            return this;
        }

        public Params addHostid(final String id) {
            hostids = ZbxListUtils.add(hostids, id);
            return this;
        }

        public Params addMaintenanceid(final String id) {
            maintenanceids = ZbxListUtils.add(maintenanceids, id);
            return this;
        }

        public Params addTemplateid(final String id) {
            templateids = ZbxListUtils.add(templateids, id);
            return this;
        }

        public Params addTriggerid(final String id) {
            triggerIds = ZbxListUtils.add(triggerIds, id);
            return this;
        }

        public Filter newFilter() {
            return new Filter();
        }
    }

    @Data
    @Accessors(chain = true)
    public class Filter {
        private List<String> name;

        public List<String> getName() {
            return name;
        }

        public void setName(List<String> name) {
            this.name = name;
        }

        public Filter addName(String name) {
            this.name = ZbxListUtils.add(this.name, name);
            return this;
        }
    }
}
