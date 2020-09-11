package hlzq.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 张冬军
 * @version 1.0
 * @date 2020/9/11 9:10
 */

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@EnableEurekaClient
public class Gateway9527 {
    public static void main(String[] args){
        SpringApplication.run (Gateway9527.class,args);
    }
}
