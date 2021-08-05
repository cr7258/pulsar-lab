package com.chengzw;

import org.apache.pulsar.common.functions.FunctionConfig;

import java.util.Collections;

/**
 * @author chengzw
 * @description
 * @since 2021/8/5
 */
public class TestLocalRun {
    public static void main(String[] args) {
        FunctionConfig functionConfig = new FunctionConfig();
        functionConfig.setName("exclamation");
        functionConfig.setInputs(Collections.singleton("input"));
        functionConfig.setClassName(ExclamationFunction.class.getName());
        functionConfig.setRuntime(FunctionConfig.Runtime.JAVA);
        functionConfig.setOutput("output");

        LocalRunner localRunner = LocalRunner.builder().functionConfig(functionConfig).build();
        localRunner.start(false);
    }
}
