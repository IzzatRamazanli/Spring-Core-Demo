package az.spring.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Application {
    public static void main(String[] args) {

        //XML based configuration
//        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
//        context.registerShutdownHook();
//
//        Notification notificationSms = context.getBean("notifications", Notification.class);
//        notificationSms.alertSms();

        //Java-based configuration
        AbstractApplicationContext context2 = new AnnotationConfigApplicationContext(SpringConfig.class);
        context2.registerShutdownHook();

        Notification notificationSms = context2.getBean( Notification.class);
        notificationSms.alertSms();

        System.out.println();

        Notification notificationEmail = context2.getBean( Notification.class);
        notificationEmail.alertEmail();

    }
}
