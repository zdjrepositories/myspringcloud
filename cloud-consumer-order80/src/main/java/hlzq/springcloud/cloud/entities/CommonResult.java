package hlzq.springcloud.cloud.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 张冬军
 * @version 1.0
 * @date 2020/9/7 10:13
 */


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult <T>{
   private  Integer code;
   private  String  message;
   private  T data;

   public CommonResult(Integer code,String message){
      this.code=code;
      this. message=message;
      this.data=null;
   }
}
