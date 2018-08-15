package com.zabbix4j.maintenance;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Suguru Yajima
 */
@Data
@Accessors(chain = true)
public class TimePeriodObject {
    private String timeperiodid;
    private Integer day;
    private Integer dayofweek;
    private Integer every;
    private Integer month;
    private Integer period;
    private Long start_date;
    private Integer start_time;
    private Integer timeperiod_type;

    public static enum WEEK_OF_THE_MONTH {
        FIRST_WEEK(1), SECOND_WEEK(2), THIRD_WEEK(3), FOURTH_WEEK(4), LAST_WEEK(5);
        public int value;

        private WEEK_OF_THE_MONTH(int value) {
            this.value = value;
        }

    }

    public static enum TIMEPERIOD_TYPE {
        ONE_TIME_ONLY(0), DAILY(2), WEEKLY(3), MONTHLY(4);
        public int value;

        private TIMEPERIOD_TYPE(int value) {
            this.value = value;
        }
    }
}
