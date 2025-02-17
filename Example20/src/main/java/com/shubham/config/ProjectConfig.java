package com.shubham.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.shubham.services", "com.shubham.implementation"})
@ComponentScan(basePackageClasses = {com.shubham.beans.Vehicle.class})
public class ProjectConfig {
}
