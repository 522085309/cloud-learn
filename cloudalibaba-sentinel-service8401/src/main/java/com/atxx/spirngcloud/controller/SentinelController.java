package com.atxx.spirngcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:XJ
 */
@RestController
public class SentinelController {
    @GetMapping(value = "/test1")
    public String test1(){
        return "test1";
    }
    @GetMapping(value = "/test2")
    public String test2(){
        return "test2";
    }

    @GetMapping(value = "/testHostKey")
    @SentinelResource(value = "testHostKey",blockHandler = "deal_testHostKey")
    public String testHostKey(@RequestParam(value = "p1",required = false) String p1,
                              @RequestParam(value = "p2",required = false) String p2){
        return "testHostKey";
    }
    public String deal_testHostKey(String p1,String p2,BlockException blockException){
        return "deal_testHostKey";
    }
}

