package com.zabbix4j.itemprototype;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Suguru Yajima
 */
@Data
@Accessors(chain = true)
public class ItemPrototypeObject {

    private String itemid;
    private String delay;
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
    private Float formula;
    private Integer history;
    private String ipmi_sensor;
    private String logtimefmt;
    private Integer multiplier;
    private String params;
    private String password;
    private String port;
    private String privatekey;
    private String publickey;
    private String snmp_community;
    private String snmp_oid;
    private String snmpv3_authpassphrase;
    private Integer snmpv3_authprotocol;
    private String snmpv3_contextname;
    private String snmpv3_privpassphrase;
    private Integer snmpv3_privprotocol;
    private Integer snmpv3_securitylevel;
    private String snmpv3_securityname;
    private Integer status;
    private String templateid;
    private String trapper_hosts;
    private Integer trends;
    private String units;
    private String username;
    private String valuemapid;

    public static enum ITEM_TYPE {
        ZABBIX_AGENT(0), SNMP_V1_AGENT(1), ZABBIX_TRAPPER(2), SIMPLE_CHECK(3), SNMP_V2_AGENT(4), ZABBIX_INTERNAL(5),
        SNMP_V3_AGENT(6), ZABBIX_AGENT_ACTIVE(7), ZABBIX_AGREEGATE(8), EXTERNAL_CHECK(10), DATABASE_MONITOR(11),
        IPMI_AGENT(12), SSH_AGENT(13), TELNET_AGENT(14), CALCULATED(15), JMX_AGENT(16), SNMP_TRAP(17);
        public int value;

        private ITEM_TYPE(int value) {
            this.value = value;
        }

    }

    public static enum VALUE_TYPE {
        NUMERIC_FLOAT(0), CHARACTOR(1), LOG(2), NUMERIC_UNSIGNED(3), TEXT(4);
        public int value;

        private VALUE_TYPE(int value) {
            this.value = value;
        }
    }

    public static enum SSH_AUTH_METHOD {
        PASWORD(0), PUBLIC_KEY(1);
        public int value;

        SSH_AUTH_METHOD(int value) {
            this.value = value;
        }
    }

    public static enum DATA_TYPE {
        DECIMAL(0), OCTAL(1), HEXADECIMAL(2), BOOLEAN(3);

        public int value;

        private DATA_TYPE(int value) {
            this.value = value;
        }
    }

    public static enum STORED_VALUE_TYPE {
        AS_IS(0), SPEED_PER_SECOND(1), SIMPLE_CHANGE(2);
        public int value;

        private STORED_VALUE_TYPE(int value) {
            this.value = value;
        }
    }

    public static enum SNMP_V3_AUTHENTICATION_PROTOCOL {
        MD5(0), SHA(1);
        public int value;

        private SNMP_V3_AUTHENTICATION_PROTOCOL(int value) {
            this.value = value;
        }
    }

    public static enum SNMP_V3_PRIVACY_PROTOCOL {
        DES(0), AES(1);
        public int value;

        private SNMP_V3_PRIVACY_PROTOCOL(int value) {
            this.value = value;
        }
    }

    public static enum SNMP_V3_SECURITY_LEVEL {
        NO_AUTH_NO_PRIV(0), AUTH_NO_PRIV(1), AUTH_PRIV(2);
        public int value;

        private SNMP_V3_SECURITY_LEVEL(int value) {
            this.value = value;
        }
    }

    public static enum STATUS {
        ENABLED_ITEM_PROTOTYPE(0), DISABLED_ITEM_PROTOTYPE(1), UNSUPPORTED_ITEM_PROTOTYPE(3);
        public int value;

        private STATUS(int value) {
            this.value = value;
        }
    }
}
