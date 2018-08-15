package com.zabbix4j.mediatype;

import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.utils.ZbxListUtils;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Suguru Yajima
 */
@Data
@Accessors(chain = true)
public class MediaTypeCreateRequest extends ZabbixApiRequest {
    private List<MediaTypeObject> params = new ArrayList<MediaTypeObject>();

    public MediaTypeCreateRequest() {
        setMethod("mediatype.create");
    }

    public MediaTypeCreateRequest addMediaType(MediaTypeObject id) {
        params = ZbxListUtils.add(params, id);
        return this;
    }
}
