package com.zabbix4j.mediatype;

import com.zabbix4j.ZabbixApiParamter;
import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * @author Suguru Yajima
 */
public class MediaTypeGetTest extends ZabbixApiTestBase {
    public MediaTypeGetTest() {
        super();
    }

    @Test
    public void testGet() throws Exception {
        MediaTypeGetRequest request = new MediaTypeGetRequest();
        MediaTypeGetRequest.Params params = request.getParams();
        params.addMediaTypeid("1");
        params.addMediaTypeid("2");
        params.addMediaTypeid("3");
        params.setSelectUsers(ZabbixApiParamter.QUERY.extend.name());

        MediaTypeGetResponse response = zabbixApi.mediaType().get(request);
        assertNotNull(response);

        logger.debug(getGson().toJson(response));

        int actualCount = response.getResult().size();
        assertThat(actualCount, is(3));
    }
}
