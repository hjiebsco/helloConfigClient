package com.hji;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HelloTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloTestApplication.class, args);
	}
}

@RefreshScope
@RestController
class MessageRestController {

    @Value("${ms:Hello default}")
    private String message;

    @RequestMapping("/ms")
    String getMessage() {
        return this.message;
    }
}

