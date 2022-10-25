package pl.lrozek.springbootfeaturetoggle.service;

public interface Service {

    String toggle = "app.alternative.feature.enabled";

    String doBusinessLogic();

}
