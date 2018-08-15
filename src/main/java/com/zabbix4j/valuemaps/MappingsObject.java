package com.zabbix4j.valuemaps;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Created by 0312birdzhang on 2016/02/19.
 */
@Data
@Accessors(chain = true)
public class MappingsObject {
    private String value;
    private String newvalue;
}
