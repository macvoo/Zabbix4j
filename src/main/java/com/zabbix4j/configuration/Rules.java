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

package com.zabbix4j.configuration;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * Created by Suguru Yajima on 2014/05/24.
 */
public class Rules {
    @Getter
    private Applications applications;
    @Getter
    private DiscoveryRules discoveryRules;
    @Getter
    private Graphs graphs;
    @Getter
    private Groups groups;
    @Getter
    private Hosts hosts;
    @Getter
    private Images images = new Images();
    @Getter
    private Items items = new Items();
    @Getter
    private Maps maps;
    @Getter
    private Screens screens;
    @Getter
    private TemplateLinkage templateLinkage;
    @Getter
    private Templates templates;
    @Getter
    private TemplateScreens templateScreens;
    @Getter
    private Triggers triggers;
    @Getter
    private ValueMaps valueMaps;

    public Rules() {
        applications = new Applications();
        discoveryRules = new DiscoveryRules();
        graphs = new Graphs();
        groups = new Groups();
        hosts = new Hosts();
        screens = new Screens();
        maps = new Maps();
        templateLinkage = new TemplateLinkage();
        templates = new Templates();
        templateScreens = new TemplateScreens();
        triggers = new Triggers();
        valueMaps = new ValueMaps();
    }

    public class Applications {
        @Accessors(chain = true)
        @Getter
        @Setter
        private Boolean createMissing = false;
        @Accessors(chain = true)
        @Getter
        @Setter
        private Boolean deleteMissing = false;
    }

    public class DiscoveryRules {
        @Accessors(chain = true)
        @Getter
        @Setter
        private Boolean createMissing = false;
        @Accessors(chain = true)
        @Getter
        @Setter
        private Boolean updateExisting = false;
        @Accessors(chain = true)
        @Getter
        @Setter
        private Boolean deleteMissing = false;
    }

    public class Graphs {
        @Accessors(chain = true)
        @Getter
        @Setter
        private Boolean createMissing = false;
        @Accessors(chain = true)
        @Getter
        @Setter
        private Boolean updateExisting = false;
        @Accessors(chain = true)
        @Getter
        @Setter
        private Boolean deleteMissing = false;
    }

    public class Groups {
        @Accessors(chain = true)
        @Getter
        @Setter
        private Boolean createMissing = false;
    }

    public class Hosts {
        @Accessors(chain = true)
        @Getter
        @Setter
        private Boolean createMissing = false;
        @Accessors(chain = true)
        @Getter
        @Setter
        private Boolean updateExisting = false;
    }

    public class Images {
        @Accessors(chain = true)
        @Getter
        @Setter
        private Boolean createMissing = false;
        @Accessors(chain = true)
        @Getter
        @Setter
        private Boolean updateExisting = false;
    }

    public class Items {
        @Accessors(chain = true)
        @Getter
        @Setter
        private Boolean createMissing = false;
        @Accessors(chain = true)
        @Getter
        @Setter
        private Boolean updateExisting = false;
        @Accessors(chain = true)
        @Getter
        @Setter
        private Boolean deleteMissing = false;
    }

    public class Maps {
        @Accessors(chain = true)
        @Getter
        @Setter
        private Boolean createMissing = false;
        @Accessors(chain = true)
        @Getter
        @Setter
        private Boolean updateExisting = false;
    }

    public class Screens {
        @Accessors(chain = true)
        @Getter
        @Setter
        private Boolean createMissing = false;
        @Accessors(chain = true)
        @Getter
        @Setter
        private Boolean updateExisting = false;
    }

    public class TemplateLinkage {
        @Accessors(chain = true)
        @Getter
        @Setter
        private Boolean createMissing = false;
    }

    public class Templates {
        @Accessors(chain = true)
        @Getter
        @Setter
        private Boolean createMissing = false;
        @Accessors(chain = true)
        @Getter
        @Setter
        private Boolean updateExisting = false;
    }

    public class TemplateScreens {
        @Accessors(chain = true)
        @Getter
        @Setter
        private Boolean createMissing = false;
        @Accessors(chain = true)
        @Getter
        @Setter
        private Boolean updateExisting = false;
        @Accessors(chain = true)
        @Getter
        @Setter
        private Boolean deleteMissing = false;
    }

    public class Triggers {
        @Accessors(chain = true)
        @Getter
        @Setter
        private Boolean createMissing = false;
        @Accessors(chain = true)
        @Getter
        @Setter
        private Boolean updateExisting = false;
        @Accessors(chain = true)
        @Getter
        @Setter
        private Boolean deleteMissing = false;
    }

    public class ValueMaps {
        @Accessors(chain = true)
        @Getter
        @Setter
        private Boolean createMissing = false;
        @Accessors(chain = true)
        @Getter
        @Setter
        private Boolean updateExisting = false;
    }
}
