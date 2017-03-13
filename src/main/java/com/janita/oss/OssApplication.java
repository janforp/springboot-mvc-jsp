package com.janita.oss;

import com.janita.oss.configuration.Config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
@EnableConfigurationProperties({Config.class})
public class OssApplication {

	public static void main(String[] args) {
		SpringApplication.run(OssApplication.class, args);
	}
}
