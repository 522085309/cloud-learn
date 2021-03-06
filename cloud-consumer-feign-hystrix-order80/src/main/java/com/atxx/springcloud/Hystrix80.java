package com.atxx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

import javax.swing.table.AbstractTableModel;

/**
 * @author:XJ
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class Hystrix80 {
    public static void main(String[] args) {
        SpringApplication.run(Hystrix80.class,args);
    }
}
