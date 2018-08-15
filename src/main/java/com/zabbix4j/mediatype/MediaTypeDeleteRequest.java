package com.zabbix4j.mediatype;

import com.zabbix4j.ZabbixApiRequest;
import java.util.ArrayList;
import java.util.List;

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

    public void addMediaTypeId(Integer id) {
        params.add(id);
    }

    /**
     * Gets params.
     *
     * @return Value of params.
     */
    public List<Integer> getParams() {
        return params;
    }

    /**
     * Sets new params.
     *
     * @param params New value of params.
     */
    public void setParams(List<Integer> params) {
        this.params = params;
    }
}
