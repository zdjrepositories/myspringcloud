package hlzq.springcloud.contorller;

import hlzq.springcloud.entities.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
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

    public static final String PAYMENT_URL="http://CLOUD-PAYMENT-SERVICE";
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
    @GetMapping("/consumer/payment/get1/{id}")
    public CommonResult<Payment> getPayment1(@PathVariable("id")Long id){
        System.out.println("张冬军张冬军张冬军张冬军"+PAYMENT_URL+"/payment/get/"+id );
        ResponseEntity<CommonResult> entity= restTemplate.getForEntity(PAYMENT_URL+"/payment/get/"+id,CommonResult.class );
        if (entity.getStatusCode().is2xxSuccessful()){
            return entity.getBody();
        }else {
            return  new CommonResult<>(444,"操作失败");
        }

    }

    @GetMapping("/consumer/payment/get2/{id}")
    public CommonResult<Payment> getPayment2(@PathVariable("id")Long id){
        System.out.println("张冬军张冬军张冬军张冬军"+PAYMENT_URL+"/payment/get/"+id );
        ResponseEntity<CommonResult> entity= restTemplate.getForEntity(PAYMENT_URL+"/payment/get/"+id,CommonResult.class );
        if (entity.getStatusCode().is2xxSuccessful()){
            return entity.getBody();
        }else {
            return  new CommonResult<>(444,"操作失败");
        }

    }
}
