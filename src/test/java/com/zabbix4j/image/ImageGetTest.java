package com.zabbix4j.image;

import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * @author Suguru Yajima
 */
public class ImageGetTest extends ZabbixApiTestBase {

    public ImageGetTest() {
        super();
    }

    @Test
    public void testGet1() throws Exception {

        String targetId = null;
        DummyImage dummyImage = new DummyImage(zabbixApi);
        try {
            targetId = dummyImage.create();

            ImageGetRequest request = new ImageGetRequest();
            ImageGetRequest.Params params = request.getParams();
            params.addImageid(targetId);
            params.setSelect_image(true);

            ImageGetResponse response = zabbixApi.image().get(request);
            assertNotNull(response);

            String actualId = response.getResult().get(0).getImageid();

            assertThat(targetId, is(actualId));

            logger.debug(getGson().toJson(response));
        } finally {
            dummyImage.delete(targetId);
        }
    }
}
