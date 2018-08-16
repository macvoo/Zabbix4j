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

package com.zabbix4j.item;

import com.zabbix4j.ZabbixApiParamter;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Created by Suguru Yajima on 2014/05/02.
 */
@Data
@Accessors(chain = true)
public class ItemObject {

    private String itemid;
    private String delay = ZabbixApiParamter.ITEM_DELAY_DEFAULT;
    private String hostid;
    private String interfaceid;
    private String key_;
    private String name;
    private Integer type;
    private Integer value_type;
    private Integer authtype;
    private Integer data_type;
    private String delay_flex;
    private Integer delta;
    private String description;
    private String error;
    private Integer flags;
    private String formula;
    private Integer history;
    private Integer inventory_link;
    private String ipmi_sensor;
    private Long lastclock;
    private Integer lastns;
    private String lastvalue;
    private String logtimefmt;
    private Long mtime;
    private Integer multiplier;
    private String params;
    private String password;
    private String port;
    private String prevorgvalue;
    private String prevvalue;
    private String privatekey;
    private String publickey;
    private String snmp_community;
    private String snmp_oid;
    private String snmpv3_authpassphrase;
    private String snmpv3_privpassphrase;
    private String snmpv3_securitylevel;
    private String snmpv3_securityname;
    private String snmpv3_authprotocol;
    private String snmpv3_privprotocol;
    private String snmpv3_contextname;
    private Integer status;
    private String templateid;
    private String trapper_hosts;
    private Integer trends;
    private String units;
    private String username;
    private String valuemapid;
    private Integer lifetime;
    private Integer lastlogsize;
    private Integer state;
    private Integer evaltype;
}

