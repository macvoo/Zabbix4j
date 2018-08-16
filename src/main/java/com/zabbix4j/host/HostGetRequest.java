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

package com.zabbix4j.host;

import com.zabbix4j.GetRequestCommonParams;
import com.zabbix4j.ZabbixApiRequest;
import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Created by Suguru Yajima on 2014/05/02.
 */
@Data
@Accessors(chain = true)
public class HostGetRequest extends ZabbixApiRequest {
    private Params params = new Params();

    public HostGetRequest() {
        setMethod("host.get");
    }

    @Data
    @Accessors(chain = true)
    public class Params extends GetRequestCommonParams {

        private List<String> groupids;

        private List<String> applicationids;

        private List<String> dserviceids;

        private List<String> graphids;

        private List<String> hostids;

        private List<String> httptestids;

        private List<String> interfaceids;

        private List<String> itemids;

        private List<String> maintenanceids;

        private boolean monitored_hosts;

        private boolean proxy_hosts;

        private List<String> proxyids;

        private boolean templated_hosts;

        private List<String> templateids;

        private List<String> triggerIds;

        private String selectGroups;

        private String selectApplications;

        private String selectDiscoveries;

        private String selectDiscoveryRule;

        private String selectGraphs;

        private String selectHostDiscovery;

        private String selectHttpTests;

        private String selectInterfaces;

        private String selectInventory;

        private String selectItems;

        private String selectMacros;

        private String selectParentTemplates;

        private String selectScreens;

        private String selectTriggers;

    }
}
