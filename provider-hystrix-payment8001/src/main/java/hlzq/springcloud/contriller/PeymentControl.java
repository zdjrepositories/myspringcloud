package hlzq.springcloud.contriller;

import hlzq.springcloud.entities.*;
import hlzq.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;




/**
 * @author 张冬军
 * @version 1.0
 * @date 2020/9/7 10:49
 */

@RestController
@Slf4j
public class PeymentControl {


    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;


    @GetMapping(value = "/payment/hystrix/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id){
        paymentService=new PaymentService();
       String result=paymentService.paymentInfo_OK(id);
        log.info("*****result:"+result);
        return result;
    }
    @GetMapping(value = "/payment/hystrix2/{id}")
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id){
        paymentService=new PaymentService();
        String result=paymentService.paymentInfo_TimeOut(id);
        log.info("*****result:"+result);
        return result;
    }
}
