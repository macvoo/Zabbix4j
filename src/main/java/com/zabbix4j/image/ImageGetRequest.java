package com.zabbix4j.image;

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
public class ImageGetRequest extends ZabbixApiRequest {
    private Params params = new Params();

    public ImageGetRequest() {
        setMethod("image.get");
    }

    @Data
    @Accessors(chain = true)
    public class Params extends GetRequestCommonParams {

        private List<String> imageids;
        private List<String> sysmapids;
        private Boolean select_image;

        public Params addImageid(final String id) {
            imageids = ZbxListUtils.add(imageids, id);
            return this;
        }

        public Params addSystemid(final String id) {
            sysmapids = ZbxListUtils.add(sysmapids, id);
            return this;
        }
    }
}
