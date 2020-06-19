package com.alibaba.yunxiao.api;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class PluginBTest {

    @org.junit.Test
    public void lowerCase() {
        String origin = "ABC";

        PluginB pluginB = new PluginB();

        assertThat(pluginB.lowerCase(origin), is("abc"));
    }

    @Test
    public void length() {
        String origin = "abcd";
        PluginB pluginB = new PluginB();

        assertThat(pluginB.length(origin), is(4));
    }

    @Test
    public void concat_test() {
        String first = "YunXiao";
        String second = "@Alibaba";

        PluginB pluginB = new PluginB();
        String concat = pluginB.concat(first, second);

        assertThat(concat, is("YunXiao@Alibaba"));
    }
}