package com.chengzw;

import org.apache.pulsar.functions.api.Context;
import org.apache.pulsar.functions.api.Function;

/**
 * @author chengzw
 * @description
 * @since 2021/8/5
 */
public class ExclamationFunction implements Function<String, String> {
    @Override
    public String process(String input, Context context) {
        return String.format("%s!", input);
    }
}