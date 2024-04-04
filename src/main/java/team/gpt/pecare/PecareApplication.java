package team.gpt.pecare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("team.gpt.pecare.mapper")
public class PecareApplication {
    public static void main(String[] args){
        SpringApplication.run(PecareApplication.class, args);
    }

}
