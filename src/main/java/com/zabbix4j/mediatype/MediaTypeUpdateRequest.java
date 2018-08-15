package com.zabbix4j.mediatype;

import com.zabbix4j.ZabbixApiRequest;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Suguru Yajima
 */
@Data
@Accessors(chain = true)
public class MediaTypeUpdateRequest extends ZabbixApiRequest {
    private List<MediaTypeObject> params = new ArrayList<MediaTypeObject>();

    public MediaTypeUpdateRequest() {
        setMethod("mediatype.update");
    }

    public MediaTypeUpdateRequest addMediaTypeObject(MediaTypeObject id) {
        params.add(id);
        return this;
    }
}
