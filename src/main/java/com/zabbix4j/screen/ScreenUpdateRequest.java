package com.zabbix4j.screen;

import com.zabbix4j.ZabbixApiRequest;
import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Suguru Yajima
 */
@Data
@Accessors(chain = true)
public class ScreenUpdateRequest extends ZabbixApiRequest {
    private Params params = new Params();

    public ScreenUpdateRequest() {
        setMethod("screen.update");
    }

    @Data
    @Accessors(chain = true)
    public class Params extends ScreenObject {
        private List<Integer> screenitems;
    }
}
