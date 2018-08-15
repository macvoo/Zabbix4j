package com.zabbix4j.graphprototype;

import com.zabbix4j.GetRequestCommonParams;
import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.utils.ZbxListUtils;

import java.util.List;

/**
 * Created by Suguru Yajima on 2014/06/02.
 */
@Data
@Accessors(chain = true)
public class GraphPrototypeGetRequest extends ZabbixApiRequest {

    private Params params = new Params();

    public GraphPrototypeGetRequest() {
        setMethod("graphprototype.get");
    }

    @Data
    @Accessors(chain = true)
    public class Params extends GetRequestCommonParams {

        private List<String> discoveryids;
        private List<String> graphids;
        private List<String> groupids;
        private List<String> hostids;
        private Boolean inherited;
        private List<String> itemids;
        private Boolean templated;
        private List<String> templateids;
        private String selectDiscoveryRule;
        private String selectGraphItems;
        private String selectGroups;
        private String selectHosts;
        private String selectItems;
        private String selectTemplates;
        private String filter;

        public void addDiscoveryId(Integer id) {
            discoveryids = ZbxListUtils.add(discoveryids, id);
        }

        public void addGraphId(Integer id) {
            graphids = ZbxListUtils.add(graphids, id);
        }

        public void addGroupId(Integer id) {
            groupids = ZbxListUtils.add(groupids, id);
        }

        public void addHostId(Integer id) {
            hostids = ZbxListUtils.add(hostids, id);
        }

        public void addItemId(Integer id) {
            itemids = ZbxListUtils.add(itemids, id);
        }

        public void addTemplateId(Integer id) {
            templateids = ZbxListUtils.add(templateids, id);
        }

        public List<Integer> getDiscoveryids() {
            return discoveryids;
        }

        public void setDiscoveryids(List<Integer> discoveryids) {
            this.discoveryids = discoveryids;
        }

        public List<Integer> getGraphids() {
            return graphids;
        }

        public void setGraphids(List<Integer> graphids) {
            this.graphids = graphids;
        }

        public List<Integer> getGroupids() {
            return groupids;
        }

        public void setGroupids(List<Integer> groupids) {
            this.groupids = groupids;
        }

        public List<Integer> getHostids() {
            return hostids;
        }

        public void setHostids(List<Integer> hostids) {
            this.hostids = hostids;
        }

        public List<Integer> getItemids() {
            return itemids;
        }

        public void setItemids(List<Integer> itemids) {
            this.itemids = itemids;
        }

        public List<Integer> getTemplateids() {
            return templateids;
        }

        public void setTemplateids(List<Integer> templateids) {
            this.templateids = templateids;
        }

        public Boolean getInherited() {
            return inherited;
        }

        public void setInherited(Boolean inherited) {
            this.inherited = inherited;
        }

        public Boolean getTemplated() {
            return templated;
        }

        public void setTemplated(Boolean templated) {
            this.templated = templated;
        }

        public String getSelectDiscoveryRule() {
            return selectDiscoveryRule;
        }

        public void setSelectDiscoveryRule(String selectDiscoveryRule) {
            this.selectDiscoveryRule = selectDiscoveryRule;
        }

        public String getSelectGraphItems() {
            return selectGraphItems;
        }

        public void setSelectGraphItems(String selectGraphItems) {
            this.selectGraphItems = selectGraphItems;
        }

        public String getSelectGroups() {
            return selectGroups;
        }

        public void setSelectGroups(String selectGroups) {
            this.selectGroups = selectGroups;
        }

        public String getSelectHosts() {
            return selectHosts;
        }

        public void setSelectHosts(String selectHosts) {
            this.selectHosts = selectHosts;
        }

        public String getSelectItems() {
            return selectItems;
        }

        public void setSelectItems(String selectItems) {
            this.selectItems = selectItems;
        }

        public String getSelectTemplates() {
            return selectTemplates;
        }

        public void setSelectTemplates(String selectTemplates) {
            this.selectTemplates = selectTemplates;
        }

        public String getFilter() {
            return filter;
        }

        public void setFilter(String filter) {
            this.filter = filter;
        }
    }
}
