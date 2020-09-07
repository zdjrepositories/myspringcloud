package hlzq.springcloud.service;

import hlzq.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author 张冬军
 * @version 1.0
 * @date 2020/9/7 10:41
 */

public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id")Long id);
}
