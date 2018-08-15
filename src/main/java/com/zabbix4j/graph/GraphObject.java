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

package com.zabbix4j.graph;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Created by Suguru Yajima on 2014/05/29.
 */
@Data
@Accessors(chain = true)
public class GraphObject {
    private String graphid;
    private Integer height;
    private String name;
    private Integer width;
    private Integer flags;
    private Integer graphtype;
    private Float percent_left;
    private Float percent_right;
    private Integer show_3d = GRAPH_SHOW_DIMENSION_TYPE.SHOW_IN_2D.value;
    private Integer show_legend = GRAPH_SHOW_TYPE.SHOW.value;
    private Integer show_work_period = GRAPH_SHOW_TYPE.SHOW.value;
    private String templateid;
    private Float yaxismax;
    private Float yaxismin;
    private Integer ymax_itemid;
    private Integer ymax_type = CALCULATION_METHOD.CALCULATED.value;
    private Integer ymin_itemid;
    private Integer ymin_type = CALCULATION_METHOD.CALCULATED.value;

    public static enum GRAPH_LAYOUT_TYPE {
        NORMAL(0), STACKED(1), PIE(2), EXPLODED(3);
        public int value;

        private GRAPH_LAYOUT_TYPE(int value) {
            this.value = value;
        }
    }

    public static enum GRAPH_SHOW_DIMENSION_TYPE {
        SHOW_IN_2D(0), SHOW_IN_3D(1);

        public int value;

        private GRAPH_SHOW_DIMENSION_TYPE(int value) {
            this.value = value;
        }
    }

    public static enum GRAPH_SHOW_TYPE {
        HIDE(0), SHOW(1);

        public int value;

        private GRAPH_SHOW_TYPE(int value) {
            this.value = value;
        }
    }

    public static enum CALCULATION_METHOD {
        CALCULATED(0), FIXED(1), ITEM(2);
        public int value;

        private CALCULATION_METHOD(int value) {
            this.value = value;
        }
    }
}
