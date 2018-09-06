package com.github.JoeKerouac.jsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author joe
 * @version 2018.09.06 20:25
 */
@SpringBootApplication
@ImportResource("*.xml")
@Controller
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @RequestMapping("hello")
    public String hello() {
        return "main";
    }
}
