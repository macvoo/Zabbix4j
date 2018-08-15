package com.zabbix4j.problem;

import com.zabbix4j.ZabbixApiResponse;
import java.util.ArrayList;
import java.util.List;

public class ProblemGetResponse extends ZabbixApiResponse {
    private List<Result> result = new ArrayList<Result>();

    public ProblemGetResponse() {
        super();
    }

    public List<Result> getResult() {
        return result;
    }

    public void setResult(List<Result> result) {
        this.result = result;
    }

    public class Result extends ProblemObject {
        public Result() {
            super();
        }
    }
}
