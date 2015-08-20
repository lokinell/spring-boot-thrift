package com.example.calculator;

import com.example.calculator.handler.CalculatorServiceHandler;
import org.apache.thrift.protocol.*;
import org.apache.thrift.server.TServlet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.*;

import javax.servlet.Servlet;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class CalculatorApplication {

    private static final Logger LOG = LoggerFactory.getLogger(CalculatorApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(CalculatorApplication.class, args);
    }

    @Bean
    public TProtocolFactory tProtocolFactory() {
        return new TBinaryProtocol.Factory();
    }
    
    @Bean
    public Servlet calculator(TProtocolFactory protocolFactory, CalculatorServiceHandler handler) {
        LOG.info("LOG00000: start calculator.");
        return new TServlet(new TCalculatorService.Processor<CalculatorServiceHandler>(handler), protocolFactory);
    }
}
