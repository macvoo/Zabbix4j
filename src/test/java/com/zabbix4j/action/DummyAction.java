package com.zabbix4j.action;

import com.zabbix4j.ZabbixApi;
import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiTestDummyMethodBase;

/**
 * @author yajima 2014
 */
public class DummyAction extends ZabbixApiTestDummyMethodBase {
    public DummyAction(ZabbixApi zabbixApi) {
        super(zabbixApi);
    }

    public String create(final String name, final String groupId) throws ZabbixApiException {
        final String hostId = "10084";

        ActionCreateRequest request = new ActionCreateRequest();

        ActionCreateRequest.Params param = request.createParam();
        param.setName(name);
        param.setEventsource(0);
        param.setEvaltype(0);
        param.setStatus(0);
        param.setEsc_period("120");
        param.setDef_shortdata("{TRIGGER.NAME}: {TRIGGER.STATUS}");
        param.setDef_longdata("{TRIGGER.NAME}: {TRIGGER.STATUS}\r\nLast value: {ITEM.LASTVALUE}\r\n\r\n{TRIGGER.URL}");

        ActionFilterCondition ac = new ActionFilterCondition();
        ac.setConditiontype(ActionFilterCondition.CONDITION_TYPE_TRIGGER.HOST.value);
        ac.setOperator(ActionFilterCondition.CONDITION_OPERATOR.EQUAL.value);
        ac.setValue(hostId);
        param.createFilter().addActionConditon(ac);

        ActionOperation ao = new ActionOperation();
        ao.setOperationtype(0);
        ao.setEsc_period(0);
        ao.setEsc_step_from(1);
        ao.setEsc_step_to(2);
        ao.setEvaltype(0);

        OperationMessageGroup omg = new OperationMessageGroup();
        omg.setUsrgrpid(groupId);
        ao.addOpmessageGrp(omg);

        OperationMessage om = new OperationMessage();
        om.setDefault_msg(1);
        om.setMediatypeid("1");
        ao.setOpmessage(om);
        param.addActionOperation(ao);

        ActionCreateResponse response = zabbixApi.action().create(request);

        return response.getResult().getActionids().get(0);
    }
}
