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

        private List<Integer> mediatypeids;
        private List<Integer> mediaids;
        private List<Integer> userids;
        private String selectUsers;

        public void addMediaTypeId(Integer id) {
            mediatypeids = ZbxListUtils.add(mediatypeids, id);
        }

        public void addMediaId(Integer id) {
            mediaids = ZbxListUtils.add(mediaids, id);
        }

        public void addUserId(Integer id) {
            userids = ZbxListUtils.add(userids, id);
            return this;
        }
    }
}
