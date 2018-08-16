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
public class MediaTypeDeleteRequest extends ZabbixApiRequest {
    private List<String> params = new ArrayList<String>();

    public MediaTypeDeleteRequest() {
        setMethod("mediatype.delete");
    }

    public MediaTypeDeleteRequest addMediaTypeid(final String id) {
        params.add(id);
        return this;
    }
}
