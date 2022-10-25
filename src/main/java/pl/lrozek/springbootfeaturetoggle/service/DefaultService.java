package pl.lrozek.springbootfeaturetoggle.service;

import static pl.lrozek.springbootfeaturetoggle.service.Service.toggle;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@ConditionalOnProperty(value = toggle, havingValue = "false", matchIfMissing = true)
@Component
public class DefaultService implements Service {

    public static String defaultFeature = "defaultFeature";

    @Override
    public String doBusinessLogic() {
        log.info("{} invoked", defaultFeature);
        return defaultFeature;
    }

}
