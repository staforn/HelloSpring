package stf;

/**
 * Copyright @ 2019 alibaba.com
 * All right reserved.
 *
 * @author dazu.zhy
 * @date 2020-01-16
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * 项目名称：PB_SpringDemo
 * 类名称：HellpSpring
 * 类描述：   第一个Spring项目
 * 创建人：Administrator
 * 创建时间：2019年7月6日 上午7:23:43
 * 修改人：Administrator
 * 修改时间：2019年7月6日 上午7:23:43
 * 修改备注：
 * @version
 *
 *
 */

//another demo: https://www.tutorialspoint.com/spring/spring_hello_world_example.htm
public class HelloSpring {

    //需要注入的属性,这个名字跟Bean里的没有任何关系
    private String message=null;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /*
     * 注意点1：依赖注入的是靠 get和set方法的名字来确认的，比如本例子中是getMessage和 setMessage，否则出错
     * 注意点2：Bean的属性名字必须是首字母小写，如本例中是 message,不能写成Message，否则报[Invalid property 'Message' of bean class [com.stf.HelloSpring]: No property 'Message' found]
     */

    public void Print(){
        System.out.println("Message is :" + this.getMessage());
    }

    public static void main(String[] args) {
        // 创建Spring上下文
        ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");

        //获取bean的实例
        HelloSpring helloSpring=(HelloSpring)context.getBean("myFirstSpringDemo");
        helloSpring.Print();
    }

}