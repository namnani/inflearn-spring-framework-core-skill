package me.whiteship.springapplicationcontext;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "me.whiteship.springapplicationcontext")
@ComponentScan(basePackageClasses = DemoApplication.class)
public class ApplicationConfigComponentScan {

}
