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

import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.utils.ZbxListUtils;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * Request paramter of action.create
 *
 * @author Suguru Yajima on 2014/05/19.
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
public class ActionCreateRequest extends ZabbixApiRequest {
    private List<Params> params = new ArrayList<Params>();

    public ActionCreateRequest() {
        setMethod("action.create");
    }

    public void add(Params param) {
        params = ZbxListUtils.add(params, param);
        return this;
    }

    public Params createParam() {
        Params param = new Params();
        params.add(param);

        return param;
    }

    @Data
    @Accessors(chain = true)
    public class Params extends ActionObject {
        private Filter filter = new Filter();
        private List<ActionOperation> operations;

        public Filter createFilter() {
            return filter;
        }

        public Params addActionOperation(ActionOperation id) {
            operations = ZbxListUtils.add(operations, id);
            return this;
        }

        @Data
        @Accessors(chain = true)
        public class Filter {
            private int evaltype;
            private List<ActionFilterCondition> conditions;
            private String eval_formula;
            private String formula;

            public Filter addActionConditon(ActionFilterCondition ac) {
                conditions = ZbxListUtils.add(conditions, ac);
                return this;
            }
        }
    }
}
