package git.gaozhanghappy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@MapperScan("git.gaozhanghappy.mapper")
@RestController
@ComponentScan(basePackages = "git.gaozhanghappy")
public class SpringbootMybatisApplication {
	@RequestMapping("/test")
	public String getTest(){
		return "test";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMybatisApplication.class, args);
	}

}
