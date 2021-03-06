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
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Created by Suguru Yajima on 2014/05/02.
 */
@Data
@Accessors(chain = true)
public class GetRequestCommonParams {
    private Integer limitSelects;
    private List<String> sortfield;
    private Boolean countOutput;
    private Boolean editable;
    private Boolean excludeSearch;
    private Object filter;
    private Integer limit;
    private String output;
    private Boolean preservekeys;
    private Map<String, String> search;
    private Boolean searchByAny;
    private Boolean searchWildcardsEnabled;
    private List<String> sortorder;
    private Boolean startSearch;

    public GetRequestCommonParams addSortField(String field) {
        sortfield = ZbxListUtils.add(sortfield, field);
        return this;
    }

    public GetRequestCommonParams addSortOrder(String order) {
        sortorder = ZbxListUtils.add(sortorder, order);
        return this;
    }
}

