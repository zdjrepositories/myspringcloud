package hlzq.springcloud.contorller;

import hlzq.springcloud.entities.CommonResult;
import hlzq.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author 张冬军
 * @version 1.0
 * @date 2020/9/7 13:42
 */

@RestController
@Slf4j
public class OrderContorller {

    public static final String PAYMENT_URL="http://cloud-payment-service";
    @Resource
    private RestTemplate restTemplate;


    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment){
       return restTemplate.postForObject(PAYMENT_URL+"/payment/create",payment,CommonResult.class );
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id")Long id){
        System.out.println("张冬军张冬军张冬军张冬军"+PAYMENT_URL+"/payment/get/"+id );
        return restTemplate.getForObject(PAYMENT_URL+"/payment/get/"+id,CommonResult.class );
    }
}
