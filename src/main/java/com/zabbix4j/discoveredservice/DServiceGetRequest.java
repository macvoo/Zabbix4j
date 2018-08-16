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

package com.zabbix4j.discoveredservice;

import com.zabbix4j.GetRequestCommonParams;
import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.utils.ZbxListUtils;
import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Created by Suguru Yajima on 2014/05/25.
 */
@Data
@Accessors(chain = true)
public class DServiceGetRequest extends ZabbixApiRequest {

    private Params params = new Params();

    public DServiceGetRequest() {
        setMethod("dservice.get");
    }

    @Data
    @Accessors(chain = true)
    public static class Params extends GetRequestCommonParams {

        private List<String> dserviceids;

        private List<String> dhostids;

        private List<String> dcheckids;

        private List<String> druleids;

        private String selectDRules;

        private String selectDHosts;

        private String selectHosts;

        public Params addDServiceid(final String id) {
            dserviceids = ZbxListUtils.add(dserviceids, id);
            return this;
        }

        public Params addDHostid(final String id) {
            dhostids = ZbxListUtils.add(dhostids, id);
            return this;
        }

        public Params addDCheckid(final String id) {
            dcheckids = ZbxListUtils.add(dcheckids, id);
            return this;
        }

        public Params addDRuleid(final String id) {
            druleids = ZbxListUtils.add(druleids, id);
            return this;
        }
    }
}
