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

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Created by Suguru Yajima on 2014/05/24.
 */
@Data
@Accessors(chain = true)
public class Rules {
    private Applications applications;

    private DiscoveryRules discoveryRules;

    private Graphs graphs;

    private Groups groups;

    private Hosts hosts;

    private Images images = new Images();

    private Items items = new Items();

    private Maps maps;

    private Screens screens;

    private TemplateLinkage templateLinkage;

    private Templates templates;

    private TemplateScreens templateScreens;

    private Triggers triggers;

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

    @Data
    @Accessors(chain = true)
    public class Applications {

        private Boolean createMissing = false;

        private Boolean deleteMissing = false;
    }

    @Data
    @Accessors(chain = true)
    public class DiscoveryRules {

        private Boolean createMissing = false;

        private Boolean updateExisting = false;

        private Boolean deleteMissing = false;
    }

    @Data
    @Accessors(chain = true)
    public class Graphs {

        private Boolean createMissing = false;

        private Boolean updateExisting = false;

        private Boolean deleteMissing = false;
    }

    @Data
    @Accessors(chain = true)
    public class Groups {

        private Boolean createMissing = false;
    }


    @Data
    @Accessors(chain = true)
    public class Hosts {

        private Boolean createMissing = false;

        private Boolean updateExisting = false;
    }

    @Data
    @Accessors(chain = true)
    public class Images {

        private Boolean createMissing = false;

        private Boolean updateExisting = false;
    }

    @Data
    @Accessors(chain = true)
    public class Items {

        private Boolean createMissing = false;

        private Boolean updateExisting = false;

        private Boolean deleteMissing = false;
    }

    @Data
    @Accessors(chain = true)
    public class Maps {

        private Boolean createMissing = false;

        private Boolean updateExisting = false;
    }

    @Data
    @Accessors(chain = true)
    public class Screens {

        private Boolean createMissing = false;

        private Boolean updateExisting = false;
    }

    @Data
    @Accessors(chain = true)
    public class TemplateLinkage {

        private Boolean createMissing = false;
    }

    @Data
    @Accessors(chain = true)
    public class Templates {

        private Boolean createMissing = false;

        private Boolean updateExisting = false;
    }

    @Data
    @Accessors(chain = true)
    public class TemplateScreens {

        private Boolean createMissing = false;

        private Boolean updateExisting = false;

        private Boolean deleteMissing = false;
    }

    @Data
    @Accessors(chain = true)
    public class Triggers {

        private Boolean createMissing = false;

        private Boolean updateExisting = false;

        private Boolean deleteMissing = false;
    }

    @Data
    @Accessors(chain = true)
    public class ValueMaps {

        private Boolean createMissing = false;

        private Boolean updateExisting = false;
    }
}
