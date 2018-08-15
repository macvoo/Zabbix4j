/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */

package com.zabbix4j.media;

import com.zabbix4j.GetRequestCommonParams;
import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.utils.ZbxListUtils;
import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Suguru Yajima
 */
@Data
@Accessors(chain = true)
public class MediaGetRequest extends ZabbixApiRequest {
    private Params params = new Params();

    public MediaGetRequest() {
        setMethod("usermedia.get");
    }

    @Data
    @Accessors(chain = true)
    public class Params extends GetRequestCommonParams {

        private List<String> mediaids;
        private List<String> usrgrpids;
        private List<String> userids;
        private List<String> mediatypeids;

        public Params addMediaid(final String id) {
            mediaids = ZbxListUtils.add(mediaids, id);
            return this;
        }

        public Params addUsrGroupid(final String id) {
            usrgrpids = ZbxListUtils.add(usrgrpids, id);
            return this;
        }

        public Params addUserid(final String id) {
            userids = ZbxListUtils.add(userids, id);
            return this;
        }

        public Params addMediaTypeid(final String id) {
            mediatypeids = ZbxListUtils.add(mediatypeids, id);
            return this;
        }
    }
}
