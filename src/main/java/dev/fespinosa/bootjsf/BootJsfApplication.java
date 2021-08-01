package dev.fespinosa.bootjsf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import javax.faces.webapp.FacesServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import java.util.Collections;

@SpringBootApplication
public class BootJsfApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootJsfApplication.class, args);
    }

    @Bean
    ServletRegistrationBean<Servlet> jsfServletRegistration (ServletContext servletContext) {
        servletContext.setInitParameter("com.sun.faces.forceLoadConfiguration", Boolean.TRUE.toString());
        ServletRegistrationBean<Servlet> srb = new ServletRegistrationBean<>();
        srb.setServlet(new FacesServlet());
        srb.setUrlMappings(Collections.singletonList("*.xhtml"));
        srb.setLoadOnStartup(1);
        return srb;
    }


}
