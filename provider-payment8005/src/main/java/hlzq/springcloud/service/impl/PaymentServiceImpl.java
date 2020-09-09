package hlzq.springcloud.service.impl;

import hlzq.springcloud.dao.PaymentDao;
import hlzq.springcloud.entities.Payment;
import hlzq.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 张冬军
 * @version 1.0
 * @date 2020/9/7 10:45
 */
@Service
public class PaymentServiceImpl  implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
         return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
