package com.zabbix4j.hostprototype;

import com.zabbix4j.ZabbixApiResponse;
import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Suguru Yajima
 */
@Data
@Accessors(chain = true)
public class HostPrototypeGetReponse extends ZabbixApiResponse {
    public List<HostPrototypeObject> result;

}
