package com.zabbix4j.image;

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
public class ImageDeleteRequest extends ZabbixApiRequest {
    private List<String> params;

    public ImageDeleteRequest() {
        setMethod("image.delete");
    }

    public ImageDeleteRequest addImageid(final String id) {
        params = ZbxListUtils.add(params, id);
        return this;
    }
}
