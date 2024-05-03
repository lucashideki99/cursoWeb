package br.com.project.myProjectWeb;

import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.w3c.dom.ls.LSOutput;
import org.slf4j.Logger;

@SpringBootApplication
public class MyProjectWebApplication {
	private static final Logger LOG = LoggerFactory.getLogger(MyProjectWebApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(MyProjectWebApplication.class, args);

		LOG.debug("Debug log console");
		LOG.debug("Debug");

	}
}
