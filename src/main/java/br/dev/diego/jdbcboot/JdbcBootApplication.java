package br.dev.diego.jdbcboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class JdbcBootApplication implements CommandLineRunner {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public static void main(String[] args) {
        SpringApplication.run(JdbcBootApplication.class, args);
    }

    @Override
    public void run(String... args) {
        String QUERY = "SELECT count(*) FROM T_ACCOUNT";

        System.out.println("Hello, there are "
                + jdbcTemplate.queryForObject(QUERY, Long.class)
                + " accounts");
    }
}
