package com.zabbix4j.proxy;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Suguru Yajima
 */
@Data
@Accessors(chain = true)
public class ProxyInterfaceObject {
    private String interfaceid;
    private String dns;
    private String ip;
    private Integer port;
    private Integer useip;
    private String hostid;

    public static enum USE_IP {
        DNS_NAME(0), IP_ADDRESS(1);
        public int value;

        private USE_IP(int value) {
            this.value = value;
        }
    }
}
