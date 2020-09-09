package hlzq.springcloud.service;

import hlzq.springcloud.entities.CommonResult;
import hlzq.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author 张冬军
 * @version 1.0
 * @date 2020/9/9 17:46
 */

@Component
@FeignClient("cloud-payment-service")
public interface PaymentFeignService {
    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id);
}

