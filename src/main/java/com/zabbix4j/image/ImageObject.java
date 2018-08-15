package com.zabbix4j.image;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Suguru Yajima
 */
@Data
@Accessors(chain = true)
public class ImageObject {
    private String imageid;
    private String name;
    private Integer imagetype;

    /**
     * Sets new imagetype.
     *
     * @param imagetype New value of imagetype.
     */
    public void setImagetype(Integer imagetype) {
        this.imagetype = imagetype;
    }

    public static enum IMAGE_TYPE {
        ICON(1), BACKGROUND_IMAGE(2);
        public int value;

        private IMAGE_TYPE(int value) {
            this.value = value;
        }
    }
}
