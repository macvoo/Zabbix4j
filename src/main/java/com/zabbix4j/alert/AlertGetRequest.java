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

package com.zabbix4j.alert;

import com.zabbix4j.GetRequestCommonParams;
import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.utils.ZbxListUtils;
import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Created by Suguru Yajima on 2014/05/21.
 */
@Data
@Accessors(chain = true)
public class AlertGetRequest extends ZabbixApiRequest {
    private Params params = new Params();

    public AlertGetRequest() {
        setMethod("alert.get");
    }

    @Data
    @Accessors(chain = true)
    public class Params extends GetRequestCommonParams {

        private List<Integer> alertids;
        private List<Integer> actionids;
        private List<Integer> eventids;
        private List<Integer> groupids;
        private List<Integer> hostids;
        private List<Integer> mediatypeids;
        private List<Integer> triggerids;
        private List<Integer> userids;
        private Long time_from;
        private Long time_till;
        private String selectHosts;
        private String selectMediatypes;
        private String selectUsers;

        public Params addAlertid(final String id) {
            alertids = ZbxListUtils.add(alertids, id);
            return this;
        }

        public Params addActionid(final String id) {
            actionids = ZbxListUtils.add(actionids, id);
            return this;
        }

        public Params addEventid(final String id) {
            eventids = ZbxListUtils.add(eventids, id);
            return this;
        }

        public Params add(final String id) {
            groupids = ZbxListUtils.add(groupids, id);
            return this;
        }

        public Params addMediaTypeid(final String id) {
            mediatypeids = ZbxListUtils.add(mediatypeids, id);
            return this;
        }

        public Params addTriggerid(final String id) {
            triggerIds = ZbxListUtils.add(triggerIds, id);
            return this;
        }

        public Params addUserid(final String id) {
            userids = ZbxListUtils.add(userids, id);
            return this;
        }

        public Params addHostid(final String id) {
            hostids = ZbxListUtils.add(hostids, id);
            return this;
        }
    }
}
