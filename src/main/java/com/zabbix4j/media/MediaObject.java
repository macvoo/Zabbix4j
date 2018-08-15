/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */

package com.zabbix4j.media;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Suguru Yajima
 */
@Data
@Accessors(chain = true)
public class MediaObject {
    private String mediaid;
    private Integer active;
    private String mediatypeid;
    private String period;
    private String sendto;
    private Integer severity;
    private Integer required;

    public static enum MEDIA_STATUS {
        ENABLED(0), DISABLED(1);
        public int value;

        private MEDIA_STATUS(int value) {
            this.value = value;
        }
    }
}
