/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 Suguru Yajima
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.zabbix4j.action;

import com.zabbix4j.utils.ZbxListUtils;
import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Suguru Yajima on 2014/05/19.
 */
@Data
@Accessors(chain = true)
public class ActionOperation {
    private String operationid;
    private Integer operationtype;
    private String actionid;
    private Integer esc_period;
    private Integer esc_step_from;
    private Integer esc_step_to;
    private Integer evaltype;
    private OperationCommand opcommand;
    private List<String> opcommand_grp;
    private List<String> opcommand_hst;
    private List<OperationCondition> opconditions;
    private List<String> opgroup;
    private OperationMessage opmessage;
    private List<OperationMessageGroup> opmessage_grp;
    private List<String> opmessage_usr;
    private List<String> optemplate;

    public ActionOperation addOpmessageGrp(OperationMessageGroup id) {
        opmessage_grp = ZbxListUtils.add(opmessage_grp, id);
        return this;
    }

    public ActionOperation addOpcommandGrp(final String id) {
        opcommand_grp = ZbxListUtils.add(opcommand_grp, id);
        return this;
    }

    public ActionOperation addOpcomandHst(final String id) {
        opcommand_hst = ZbxListUtils.add(opcommand_hst, id);
        return this;
    }

    public ActionOperation addOpondition(OperationCondition oc) {
        opconditions = ZbxListUtils.add(opconditions, oc);
        return this;
    }

    public ActionOperation addOpgroup(final String id) {
        opgroup = ZbxListUtils.add(opgroup, id);
        return this;
    }

    public ActionOperation addOpmessageUsr(final String id) {
        opmessage_usr = ZbxListUtils.add(opmessage_usr, id);
        return this;
    }

    public ActionOperation addOptemplate(final String id) {
        optemplate = ZbxListUtils.add(optemplate, id);
        return this;
    }

    public ActionOperation addOpConditons(OperationCondition oc) {
        this.opconditions = ZbxListUtils.add(opconditions, oc);
        return this;
    }
}
