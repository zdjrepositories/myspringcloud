package hlzq.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author 张冬军
 * @version 1.0
 * @date 2020/9/10 13:36
 */
@Component
public class PaymentFallbackService implements PaymentFeignService {
    @Override
    public String p(Integer id) {
        return "PaymentFallbackService11111111";
    }

    @Override
    public String v(Integer id) {
        return "PaymentFallbackService22222222";
    }
}
