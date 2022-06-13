package az.spring.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "az.spring.demo")//This is enough for Annotation based Java configuration
public class SpringConfig {

    @Bean("employee")
    public Employee getEmployee() {

        Employee employee = new Employee();
        employee.setName("Izzat");
        employee.setSurname("Ramazanli");

        return employee;
    }

    //
//    @Bean("sms")
//    public Message getSms() {
//        return new Sms();
//    }
//
//    @Bean("email")
//    public Message getEmail() {
//        return new Email();
//    }



//    @Bean("sms-notification")
//    public Notification getNotificationSms() {
//        Notification notification = new Notification();
//        return notification;
//    }
//
//    @Bean(initMethod = "myInit", destroyMethod = "myDestroy", name = "email-notification")
//    public Notification getNotificationEmail() {
//        Notification notification = new Notification();
//        return notification;
//    }


}
