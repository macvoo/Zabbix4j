package com.zabbix4j.proxy;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Suguru Yajima
 */
@Data
@Accessors(chain = true)
public class ProxyObject {
    private String proxyid;
    private String host;
    private Integer status;
    private Long lastaccess;

    public static enum STATUS {
        ACTIVE_PROXY(5), PASSIVE_PROXY(6);
        public int value;

        private STATUS(int value) {
            this.value = value;
        }
    }
}
