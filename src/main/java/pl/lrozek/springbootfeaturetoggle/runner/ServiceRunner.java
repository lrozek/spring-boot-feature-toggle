package pl.lrozek.springbootfeaturetoggle.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import pl.lrozek.springbootfeaturetoggle.service.Service;

@Component
public class ServiceRunner implements CommandLineRunner {

    @Autowired
    private Service service;

    @Override
    public void run(String... args) throws Exception {
        service.doBusinessLogic();
    }

}
