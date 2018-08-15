package com.zabbix4j.user;

import com.zabbix4j.ZabbixApiException;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

/**
 * Created by Suguru Yajima on 2014/04/26.
 */
public class UserTest {

    public UserTest() {

    }

    @Test
    public void testLogin1() {

        User user = new User("http://x.x.x.x:80/api_jsonrpc.php");
        UserLoginRequest request = new UserLoginRequest();
        request.getParams().setUser("Admin");
        request.getParams().setPassword("zabbix");

        try {
            UserLoginResponse response = user.login(request);

            assertNotNull(response);

            assertNotNull(response.getResult());
        } catch (ZabbixApiException e) {
            fail();
        }
    }
}
