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

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Suguru Yajima
 */
@Data
@Accessors(chain = true)
public class MapObject {
    private String sysmapid;
    private Integer height;
    private String name;
    private Integer width;
    private String backgrounid;
    private Integer expand_macros;
    private Integer expandproblem;
    private Integer grid_align;
    private Integer grid_show;
    private Integer grid_size;
    private Integer highlight;
    private Integer iconmapid;
    private Integer label_format;
    private Integer label_location;
    private String label_string_host;
    private String label_string_hostgroup;
    private String label_string_image;
    private String label_string_map;
    private String label_string_trigger;
    private Integer label_type;
    private Integer label_type_host;
    private Integer label_type_hostgroup;
    private Integer label_type_image;
    private Integer label_type_map;
    private Integer label_type_trigger;
    private Integer markelements;
    private Integer severity_min;
    private Integer show_unack;

    public static enum EXPAND_MACROS {
        DO_NOT_EXPAND_MACROS(0), EXPAND_MACRO(1);
        public int value;

        private EXPAND_MACROS(int value) {
            this.value = value;
        }

    }

    public static enum EXPAND_PROBLEM {
        ALWAYS_DISPLAY(0), DISPLAY_THE_PROBLEM(1);
        public int value;

        private EXPAND_PROBLEM(int value) {
            this.value = value;
        }
    }

    public static enum GRID_ALIGN {
        DISABLE_GRID_ALIGNING(0), ENABLE_GRID_ALIGNING(1);
        public int value;

        private GRID_ALIGN(int value) {
            this.value = value;
        }
    }

    public static enum GRID_SHOW {
        DO_NOT_SHOW_THE_GRID(0), SHOW_THE_GRID(1);
        public int value;

        private GRID_SHOW(int value) {
            this.value = value;
        }
    }

    public static enum GRID_SIZE {
        SIZE_20(20), SIZE_40(40), SIZE_50(50), SIZE(75), SIZE_100(100);
        public int value;

        private GRID_SIZE(int value) {
            this.value = value;
        }
    }

    public static enum ICON_HIGHLIGHTING {
        DISABLED(0), ENABLED(1);
        public int value;

        private ICON_HIGHLIGHTING(int value) {
            this.value = value;
        }
    }

    public static enum ADVANCED_LABELS {
        DISABLE(0), ENABLE(1);
        public int value;

        private ADVANCED_LABELS(int value) {
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

    public static enum LABEL_TYPE {
        LABEL(0), IP_ADDRESS(1), ELEMENT_NAME(2), STATUS_ONLY(3), NOTHING(4);
        public int value;

        private LABEL_TYPE(int value) {
            this.value = value;
        }
    }

    public static enum LABEL_TYPE_HOST {
        LABEL(0), IP_ADDRESS(1), ELEMENT_NAME(2), STATUS_ONLY(3), NOTHING(4), CUSTOM(5);
        public int value;

        private LABEL_TYPE_HOST(int value) {
            this.value = value;
        }
    }

    public static enum LABEL_TYPE_HOSTGROUP {
        LABEL(0), IP_ADDRESS(1), ELEMENT_NAME(2), STATUS_ONLY(3), NOTHING(4), CUSTOM(5);
        public int value;

        private LABEL_TYPE_HOSTGROUP(int value) {
            this.value = value;
        }
    }

    public static enum LABEL_TYPE_IMAGE {
        LABEL(0), IP_ADDRESS(1), ELEMENT_NAME(2), NOTHING(4), CUSTOM(5);
        public int value;

        private LABEL_TYPE_IMAGE(int value) {
            this.value = value;
        }
    }

    public static enum LABEL_TYPE_MAP {
        LABEL(0), IP_ADDRESS(1), ELEMENT_NAME(2), STATUS_ONLY(3), NOTHING(4), CUSTOM(5);
        public int value;

        private LABEL_TYPE_MAP(int value) {
            this.value = value;
        }
    }

    public static enum LABEL_TYPE_TRIGGER {
        LABEL(0), IP_ADDRESS(1), ELEMENT_NAME(2), STATUS_ONLY(3), NOTHING(4), CUSTOM(5);
        public int value;

        private LABEL_TYPE_TRIGGER(int value) {
            this.value = value;
        }
    }

    public static enum MARK_ELEMENTS {
        DO_NOT_HIGHLIGHT(0), HIGHLIGHT(1);
        public int value;

        private MARK_ELEMENTS(int value) {
            this.value = value;
        }
    }

    public static enum SHOW_UNACK {
        DISPLAY_ALL_PROBLEMS(0), DISPLAY_ONLY_UNACKNOWLAGED_PROBLEMS(1), DISPLAY_ACKNOWLAGED_AND_UNACKNOWLAGED_PROBLEMS(2);
        public int value;

        private SHOW_UNACK(int value) {
            this.value = value;
        }
    }
}
