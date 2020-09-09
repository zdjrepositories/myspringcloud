package hlzq.springcloud.contorller;

import hlzq.springcloud.entities.*;
import hlzq.springcloud.service.PaymentFeignService;
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
    @Resource
    private PaymentFeignService paymentFeignService;



    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id")Long id){
        System.out.println("张冬军"+paymentFeignService.getPaymentById(id) );
        return paymentFeignService.getPaymentById(id);
    }

}
