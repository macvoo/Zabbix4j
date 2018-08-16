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

package com.zabbix4j.action;

import com.zabbix4j.GetRequestCommonParams;
import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.utils.ZbxListUtils;
import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Suguru Yajima on 2014/05/20.
 */
@Data
@Accessors(chain = true)
public class ActionGetRequest extends ZabbixApiRequest {

    private Params params = new Params();

    public ActionGetRequest() {
        setMethod("action.get");
    }

    @Data
    @Accessors(chain = true)
    public class Params extends GetRequestCommonParams {

        private List<String> actionids;

        private List<String> groupids;

        private List<String> hostids;

        private List<String> triggerIds;

        private List<String> mediatypeids;

        private List<String> usrgrpids;

        private List<String> userids;

        private List<String> scriptids;

        public Params addActionid(final String id) {
            actionids = ZbxListUtils.add(actionids, id);
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

        public Params addTriggerid(final String id) {
            triggerIds = ZbxListUtils.add(triggerIds, id);
            return this;
        }

        public Params addmediaTypeid(final String id) {
            mediatypeids = ZbxListUtils.add(mediatypeids, id);
            return this;
        }

        public Params addUserGroupid(final String id) {
            usrgrpids = ZbxListUtils.add(usrgrpids, id);
            return this;
        }

        public Params adduserid(final String id) {
            userids = ZbxListUtils.add(userids, id);
            return this;
        }

        public Params addScriptid(final String id) {
            scriptids = ZbxListUtils.add(scriptids, id);
            return this;
        }
    }
}
