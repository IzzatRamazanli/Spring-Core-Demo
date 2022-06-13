package az.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Notification {

    private Message sms;
    private Message email;
    private Employee employee;

    public Notification() {

    }

    public Notification(Employee employee) {
        this.employee = employee;
        //constructor injection
    }

    //setter injection
    @Autowired
    @Qualifier("sms")
    public void setSms(Message sms) {
        this.sms = sms;
    }

    @Autowired
    @Qualifier("email")
    public void setEmail(Message email) {
        this.email = email;
    }

    @Autowired
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void alertSms() {
        System.out.print("SMS sent to: ");
        System.out.println(this.employee.getName() + " " + this.employee.getSurname());
        this.sms.send();
    }

    public void alertEmail() {
        System.out.print("Email sent to: ");
        System.out.println(this.employee.getName() + " " + this.employee.getSurname());
        this.email.send();
    }

    @PostConstruct
    public void myInit() {
        System.out.println("Bean initialized");
    }

    @PreDestroy
    public void myDestroy() {
        System.out.println("Bean destroyed");
    }
}
