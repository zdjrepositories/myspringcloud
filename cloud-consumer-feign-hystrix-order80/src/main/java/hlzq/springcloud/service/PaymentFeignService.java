package hlzq.springcloud.service;

import hlzq.springcloud.entities.CommonResult;
import hlzq.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author 张冬军
 * @version 1.0
 * @date 2020/9/9 17:46
 */
@Service
@Component
@FeignClient(value = "CLOUD-PROVIDER-HYSTRIX-SERVICE",fallback =PaymentFallbackService.class)
public interface PaymentFeignService {
    @GetMapping(value = "/payment/hystrix/{id}")
    public String p(@PathVariable("id")Integer id);
    @GetMapping(value = "/payment/hystrix2/{id}")
    public String v(@PathVariable("id")Integer id);
}

