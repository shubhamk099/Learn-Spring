package com.shubham.Main;

import com.shubham.beans.Person;
import com.shubham.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example18 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        System.out.println("Before retrieving the person bean from the Spring Context");

        Person person = context.getBean(Person.class);

        System.out.println("After retrieving the person bean from the Spring Context");

        context.close();
    }
}
