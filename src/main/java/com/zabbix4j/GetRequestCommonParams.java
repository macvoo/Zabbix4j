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

package com.zabbix4j;

import com.zabbix4j.utils.ZbxListUtils;
import java.util.List;
import java.util.Map;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * Created by Suguru Yajima on 2014/05/02.
 */
public class GetRequestCommonParams {

    @Accessors(chain = true)
    @Getter
    @Setter
    private Integer limitSelects;
    @Accessors(chain = true)
    @Getter
    @Setter
    private List<String> sortfield;
    @Accessors(chain = true)
    @Getter
    @Setter
    private Boolean countOutput;
    @Accessors(chain = true)
    @Getter
    @Setter
    private Boolean editable;
    @Accessors(chain = true)
    @Getter
    @Setter
    private Boolean excludeSearch;
    @Accessors(chain = true)
    @Getter
    @Setter
    private Object filter;
    @Accessors(chain = true)
    @Getter
    @Setter
    private Integer limit;
    @Accessors(chain = true)
    @Getter
    @Setter
    private String output;
    @Accessors(chain = true)
    @Getter
    @Setter
    private Boolean preservekeys;
    @Accessors(chain = true)
    @Getter
    @Setter
    private Map<String, String> search;
    @Accessors(chain = true)
    @Getter
    @Setter
    private Boolean searchByAny;
    @Accessors(chain = true)
    @Getter
    @Setter
    private Boolean searchWildcardsEnabled;
    @Accessors(chain = true)
    @Getter
    @Setter
    private List<String> sortorder;
    @Accessors(chain = true)
    @Getter
    @Setter
    private Boolean startSearch;

    public GetRequestCommonParams() {
    }

    public void addSortField(String field) {
        sortfield = ZbxListUtils.add(sortfield, field);
    }

    public void addSortOrder(String order) {
        sortorder = ZbxListUtils.add(sortorder, order);
    }
}

