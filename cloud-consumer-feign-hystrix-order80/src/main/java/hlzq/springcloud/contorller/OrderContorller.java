package hlzq.springcloud.contorller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import hlzq.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 张冬军
 * @version 1.0
 * @date 2020/9/7 13:42
 */

@RestController
@Slf4j
public class OrderContorller {
    @Resource
    private PaymentFeignService paymentFeignService;



    @GetMapping("/payment/hystrix/{id}")
    public String getPayment1(@PathVariable("id")Integer id){
        return paymentFeignService.p(id);
    }
    @GetMapping("/payment/hystrix2/{id}")

    @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1000"),
//            @HystrixProperty(name = "circuitBreaker.enabled", value = "true"),              //是否开启断路器
//            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),    //请求数达到后才计算
//            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "10000"), //休眠时间窗
//            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "60"),  //错误率达到多少跳闸
    })
    public String paymentInfo_TimeOutHandler(Integer id) {
        return paymentFeignService.p(id);}

}
