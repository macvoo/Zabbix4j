package com.zabbix4j.image;

import com.zabbix4j.ZabbixApiResponse;
import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Suguru Yajima
 */
@Data
@Accessors(chain = true)
public class ImageGetResponse extends ZabbixApiResponse {
    private List<Result> result;

    @Data
    @Accessors(chain = true)
    public class Result extends ImageObject {

        /**
         * Base64 encoded image. The maximum size of the encoded image is 1 MB¬
         */
        private String image;
    }
}
