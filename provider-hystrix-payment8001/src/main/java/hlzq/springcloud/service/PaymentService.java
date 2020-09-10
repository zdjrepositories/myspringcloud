package hlzq.springcloud.service;

import hlzq.springcloud.entities.*;
import org.apache.ibatis.annotations.Param;

import java.util.concurrent.TimeUnit;

/**
 * @author 张冬军
 * @version 1.0
 * @date 2020/9/7 10:41
 */

public class PaymentService {

   public String paymentInfo_OK(Integer id){
       return "线程池："+Thread.currentThread().getName()+"   paymentInfo_OK, id:  "+id+"\t------";
   }
    public String paymentInfo_TimeOut(Integer id){
        try {
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } finally {
            return "线程池："+Thread.currentThread().getName()+"   paymentInfo_TimeOut, id:  "+id+"\t------耗时3秒";

        }
         }
}
