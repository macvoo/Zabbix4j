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

package com.zabbix4j.host;

import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.hostgroup.HostgroupObject;
import com.zabbix4j.hostinteface.HostInterfaceObject;
import com.zabbix4j.template.TemplateObject;
import com.zabbix4j.usermacro.Macro;
import com.zabbix4j.utils.ZbxListUtils;
import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Created by Suguru Yajima on 2014/04/30.
 */
@Data
@Accessors(chain = true)
public class HostCreateRequest extends ZabbixApiRequest {
    private Params params = new Params();

    public HostCreateRequest() {
        setMethod("host.create");
    }

    @Data
    @Accessors(chain = true)
    public class Params extends HostObject {

        private List<HostgroupObject> groups;
        private List<HostInterfaceObject> interfaces;
        private List<TemplateObject> templates;
        private List<Macro> macros;
        private Integer inventory_mode;
        private List<Object> inventory;

        public Params addGroupid(final String id) {
            HostgroupObject obj = new HostgroupObject();
            obj.setGroupid(id);
            groups = ZbxListUtils.add(groups, obj);
            return this;
        }

        public Params addHostInterfaceObject(HostInterfaceObject id) {
            interfaces = ZbxListUtils.add(interfaces, id);
            return this;
        }

        public Params addTemplate(final TemplateObject id) {
            templates = ZbxListUtils.add(templates, id);
            return this;
        }

        public Params addMacro(Macro id) {
            macros = ZbxListUtils.add(macros, id);
            return this;
        }
    }
}
