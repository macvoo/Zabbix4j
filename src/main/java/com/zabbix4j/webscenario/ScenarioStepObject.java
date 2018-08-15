package com.zabbix4j.webscenario;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Suguru Yajima
 */
@Data
@Accessors(chain = true)
public class ScenarioStepObject {
    private String httpstepid;
    private String name;
    private Integer no;
    private String url;
    private Integer httptestid;
    private String posts;
    private String required;
    private String status_codes;
    private Integer timeout;
    private String variables;
}
