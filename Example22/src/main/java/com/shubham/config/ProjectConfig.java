package com.shubham.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com.shubham.services", "com.shubham.implementation", "com.shubham.aspects"})
@ComponentScan(basePackageClasses = {com.shubham.beans.Vehicle.class})
@EnableAspectJAutoProxy
public class ProjectConfig {
}
