package com.example.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
public class SpringbootApplication {

    public static Logger logger = LoggerFactory.getLogger(SpringbootApplication.class);


    public static void main(String[] args) throws UnknownHostException {

        System.setProperty("spring.devtools.restart.enabled", "false");
        ConfigurableApplicationContext ctx = SpringApplication.run(SpringbootApplication.class, args);
        String host = InetAddress.getLocalHost().getHostAddress();
        Environment environment = ctx.getBean(Environment.class);
        String port = environment.getProperty("local.server.port");

        String url = "http://" + host + ":" + port + "/doc.html";
        logger.info("--------------启动成功-------------   " + url);
        logger.info("--------------启动项目端口---------   " + port);
    }

}
