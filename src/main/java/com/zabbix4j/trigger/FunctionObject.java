package com.zabbix4j.trigger;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Suguru Yajima
 */
@Data
@Accessors(chain = true)
public class FunctionObject {
    private String functionid;
    private String itemid;
    private String function;
    private String parameter;
}
