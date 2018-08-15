package com.zabbix4j.image;

import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotNull;

/**
 * @author Suguru Yajima
 */
public class ImageDeleteTest extends ZabbixApiTestBase {

    public ImageDeleteTest() {
        super();
    }

    @Test
    public void testDelete() throws Exception {

        DummyImage dummyImage = new DummyImage(zabbixApi);
        String targetId = dummyImage.create();

        ImageDeleteRequest request = new ImageDeleteRequest();
        request.addImageid(targetId);

        ImageDeleteResponse response = zabbixApi.image().delete(request);
        assertNotNull(response);

        logger.debug(getGson().toJson(response));

        String actualId = response.getResult().getImageids().get(0);
        assertThat(targetId, is(actualId));
    }
}
