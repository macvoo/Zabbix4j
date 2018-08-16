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

package com.zabbix4j.item;

import com.zabbix4j.GetRequestCommonParams;
import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.utils.ZbxListUtils;
import java.util.List;
import java.util.Map;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Created by Suguru Yajima on 2014/05/02.
 */
@Data
@Accessors(chain = true)
public class ItemGetRequest extends ZabbixApiRequest {
    private Params params = new Params();

    public ItemGetRequest() {
        setMethod("item.get");
    }

    @Data
    @Accessors(chain = true)
    public class Params extends GetRequestCommonParams {
        private List<String> itemids;
        private List<String> groupids;
        private List<String> templateids;
        private List<String> hostids;
        private List<String> proxyids;
        private List<String> interfaceids;
        private List<String> graphids;
        private List<String> triggerIds;
        private List<String> applicationids;
        private Boolean webitems;
        private Boolean inherited;
        private Boolean templated;
        private Boolean monitored;
        private String group;
        private String host;
        private String application;
        private Boolean with_triggers;
        private Map<String, String> searchKey;

        public Params addItemid(final String id) {
            itemids = ZbxListUtils.add(itemids, id);
            return this;
        }

        public Params addGroupid(final String id) {
            groupids = ZbxListUtils.add(groupids, id);
            return this;
        }

        public Params addTemplateid(final String id) {
            templateids = ZbxListUtils.add(templateids, id);
            return this;
        }

        public Params addHostid(final String id) {
            hostids = ZbxListUtils.add(hostids, id);
            return this;
        }

        public Params addProxyid(final String id) {
            proxyids = ZbxListUtils.add(proxyids, id);
            return this;
        }

        public Params addInterfaceid(final String id) {
            interfaceids = ZbxListUtils.add(interfaceids, id);
            return this;
        }

        public Params addGraphid(final String id) {
            graphids = ZbxListUtils.add(graphids, id);
            return this;
        }

        public Params addTriggerid(final String id) {
            triggerIds = ZbxListUtils.add(triggerIds, id);
            return this;
        }

        public Params addApplicationid(final String id) {
            applicationids = ZbxListUtils.add(applicationids, id);
            return this;
        }
    }
}
