/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */

package com.zabbix4j.media;

import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * @author Suguru Yajima
 */
public class MediaGetTest extends ZabbixApiTestBase {

    public MediaGetTest() {
        super();
    }

    @Test
    public void testGet() throws Exception {
        MediaGetRequest request = new MediaGetRequest();
        MediaGetRequest.Params params = request.getParams();
        params.addUserid("1");

        MediaGetResponse response = zabbixApi.media().get(request);
        assertNotNull(response);

        logger.debug(getGson().toJson(response));
    }
}
