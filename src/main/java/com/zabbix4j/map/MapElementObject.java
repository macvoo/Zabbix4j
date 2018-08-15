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

package com.zabbix4j.map;

import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Suguru Yajima
 */
@Data
@Accessors(chain = true)
public class MapElementObject {
    private Integer selementid;
    private Integer elementid;
    private Integer elementtype;
    private Integer iconid_off;
    private Integer areatype;
    private Integer elementsubtype;
    private Integer height;
    private Integer iconid_disabled;
    private Integer iconid_maintenance;
    private Integer iconid_on;
    private String label;
    private Integer label_location;
    private String sysmapid;
    private List<MapElementURLObject> urls;
    private Integer use_iconmap;
    /**
     * Possible values: 0 - (default) grid
     */
    private Integer viewtype;
    private Integer width;
    private Integer x;
    private Integer y;

    public static enum ELEMENT_TYPE {
        HOST(0), MAP(1), TRIGGER(2), HOST_GROUP(3), IMAGE(4);
        public int value;

        private ELEMENT_TYPE(int value) {
            this.value = value;
        }
    }

    public static enum AREA_TYPE {
        WHOLE_MAP(0), FIXED_SIZE(1);
        public int value;

        private AREA_TYPE(int value) {
            this.value = value;
        }
    }

    public static enum ELEMENT_SUB_TYPE {
        SINGLE_ELEMENT(0), SEPARATELY(1);
        public int value;

        private ELEMENT_SUB_TYPE(int value) {
            this.value = value;
        }
    }

    public static enum LABEL_LOCATION {
        BOTTOM(0), LEFT(1), RIGHT(2), TOP(3);
        public int value;

        private LABEL_LOCATION(int value) {
            this.value = value;
        }
    }

    public static enum USE_ICONMAP {
        DO_NOT_USE_ICON_MAPPING(0), USE_ICON_MAPPING(1);
        public int value;

        private USE_ICONMAP(int value) {
            this.value = value;
        }
    }
}
