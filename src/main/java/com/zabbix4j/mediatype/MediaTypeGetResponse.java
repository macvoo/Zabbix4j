package com.zabbix4j.mediatype;

import com.zabbix4j.ZabbixApiResponse;
import com.zabbix4j.user.UserObject;
import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Suguru Yajima
 */
@Data
@Accessors(chain = true)
public class MediaTypeGetResponse extends ZabbixApiResponse {
    private List<Result> result;

    @Data
    @Accessors(chain = true)
    public class Result extends MediaTypeObject {

        private List<UserObject> users;
    }
}
