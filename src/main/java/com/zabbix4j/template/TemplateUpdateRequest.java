package com.zabbix4j.template;

import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.host.HostObject;
import com.zabbix4j.hostgroup.HostgroupObject;
import com.zabbix4j.usermacro.Macro;
import com.zabbix4j.utils.ZbxListUtils;
import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Suguru Yajima
 */
@Data
@Accessors(chain = true)
public class TemplateUpdateRequest extends ZabbixApiRequest {
    private Params params = new Params();

    public TemplateUpdateRequest() {
        setMethod("template.update");
    }

    @Data
    @Accessors(chain = true)
    public class Params extends TemplateObject {
        private List<HostgroupObject> groups;
        private List<HostObject> hosts;
        private List<Macro> macros;
        private List<TemplateObject> templates;
        private List<TemplateObject> templates_clear;

        public Params addGroupid(final String id) {
            HostgroupObject obj = new HostgroupObject();
            obj.setGroupid(id);
            groups = ZbxListUtils.add(groups, obj);
            return this;
        }

        public Params addHostid(final String id) {
            HostObject obj = new HostObject();
            obj.setHostid(id);
            hosts = ZbxListUtils.add(hosts, obj);
            return this;
        }

        public Params addMacro(String macro, String value) {
            Macro obj = new Macro();
            obj.setMacro(macro);
            obj.setValue(value);
            macros = ZbxListUtils.add(macros, obj);
            return this;
        }

        public Params addTemplateid(final String id) {
            TemplateObject obj = new TemplateObject();
            obj.setTemplateid(id);
            templates = ZbxListUtils.add(templates, obj);
            return this;
        }

        public Params addClearTemplate(final String id) {
            TemplateObject obj = new TemplateObject();
            obj.setTemplateid(id);
            templates_clear = ZbxListUtils.add(templates_clear, obj);
            return this;
        }
    }
}
