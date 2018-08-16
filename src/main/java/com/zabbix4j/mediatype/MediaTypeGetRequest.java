package com.zabbix4j.mediatype;

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
public class MediaTypeGetRequest extends ZabbixApiRequest {
    private Params params = new Params();

    public MediaTypeGetRequest() {
        setMethod("mediatype.get");
    }

    @Data
    @Accessors(chain = true)
    public class Params extends GetRequestCommonParams {

        private List<String> mediatypeids;
        private List<String> mediaids;
        private List<String> userids;
        private String selectUsers;

        public Params addMediaTypeid(final String id) {
            mediatypeids = ZbxListUtils.add(mediatypeids, id);
            return this;
        }

        public Params addMediaid(final String id) {
            mediaids = ZbxListUtils.add(mediaids, id);
            return this;
        }

        public Params addUserid(final String id) {
            userids = ZbxListUtils.add(userids, id);
            return this;
        }
    }
}
