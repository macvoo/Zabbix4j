package com.zabbix4j.image;

import com.zabbix4j.ZabbixApiRequest;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Suguru Yajima
 */
@Data
@Accessors(chain = true)
public class ImageUpdateRequest extends ZabbixApiRequest {
    private Params params = new Params();

    public ImageUpdateRequest() {
        setMethod("image.update");
    }

    @Data
    @Accessors(chain = true)
    public class Params extends ImageObject {

        /**
         * Base64 encoded image. The maximum size of the encoded image is 1 MB
         */
        private String image;
    }
}
