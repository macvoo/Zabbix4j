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

import com.google.gson.annotations.SerializedName;
import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.hostinteface.HostInterfaceObject;
import com.zabbix4j.usermacro.Macro;
import com.zabbix4j.utils.ZbxListUtils;
import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Created by Suguru Yajima on 2014/05/01.
 */
@Data
@Accessors(chain = true)
public class HostUpdateRequest extends ZabbixApiRequest {
    private Params params = new Params();

    public HostUpdateRequest() {
        setMethod("host.update");
    }

    @Data
    @Accessors(chain = true)
    public class Params extends HostObject {

        private List<Group> groups;
        private List<HostInterfaceObject> interfaces;
        private List<Integer> templates;
        @SerializedName("templates_clear")
        private List<UnLinkTemplate> templatesClear;
        private List<Macro> macros;

        public Params addGroup(final Integer id) {
            this.groups = ZbxListUtils.add(groups, new Group().setGroupid(id));
            return this;
        }

        public Params addHostInterfaceObject(final HostInterfaceObject id) {
            this.interfaces = ZbxListUtils.add(interfaces, id);
            return this;
        }

        public Params addTemplate(final Integer id) {
            this.templates = ZbxListUtils.add(templates, id);
            return this;
        }

        public Params addTemplatesClear(final String id) {
            this.templatesClear = ZbxListUtils.add(templatesClear, new UnLinkTemplate(id));
            return this;
        }

        public Params addMacro(final Macro id) {
            this.macros = ZbxListUtils.add(macros, id);
            return this;
        }
    }

    @Data
    @Accessors(chain = true)
    public class Group {
        private int groupid;
    }

    @Data
    @Accessors(chain = true)
    public class UnLinkTemplate {
        private String templateid;

        public UnLinkTemplate(String templateId) {
        }
    }
}
