package com.github.smkjke.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:browserstack.properties"
})

public interface BrowserstackConfig extends Config{

    @Key("browserstackUser")
    @DefaultValue("mikhailsmkjkevor_r7iEat")
    String browserstackUser();

    @Key("browserstackKey")
    @DefaultValue("9pjsQnkGcyywmrXyzzkx")
    String browserstackKey();

    @Key("app")
    @DefaultValue("bs://c6fdaa1220bbb5481bc3008456a8359856c8df39")
    String app();

    @Key("device")
    @DefaultValue("Google Pixel 3")
    String device();

    @Key("osVersion")
    @DefaultValue("9.0")
    String osVersion();
}