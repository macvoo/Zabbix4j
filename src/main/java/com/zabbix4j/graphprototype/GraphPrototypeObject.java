package com.zabbix4j.graphprototype;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Created by Suguru Yajima on 2014/06/01.
 */
@Data
@Accessors(chain = true)
public class GraphPrototypeObject {

    private String graphid;
    private Integer height;
    private String name;
    private Integer width;
    private Integer graphtype;
    private Float percent_left = 0f;
    private Float percent_right = 0f;
    private Integer show_3d = SHOW_3D.SHOW_IN_2D.value;
    private Integer show_legend = SHOW_LEGEND.SHOW.value;
    private Integer show_work_period = WORK_PERIOD.SHOW.value;
    private String templateid;
    private Float yaxismax;
    private Float yaxismin;

    public static enum GRAPH_PROTOTYPE_TYPE {
        NORMAIL(0), STACKED(1), PIE(2), EXPLODED(3);
        public int value;

        private GRAPH_PROTOTYPE_TYPE(int value) {
            this.value = value;
        }
    }

    public enum SHOW_3D {
        SHOW_IN_2D(0), SHOW_IN_3D(1);

        public int value;

        private SHOW_3D(int value) {
            this.value = value;
        }
    }

    public static enum SHOW_LEGEND {
        HIDE(0), SHOW(1);
        public int value;

        private SHOW_LEGEND(int value) {
            this.value = value;
        }
    }

    public static enum WORK_PERIOD {
        HIDE(0), SHOW(1);
        public int value;

        private WORK_PERIOD(int value) {
            this.value = value;
        }
    }
}
