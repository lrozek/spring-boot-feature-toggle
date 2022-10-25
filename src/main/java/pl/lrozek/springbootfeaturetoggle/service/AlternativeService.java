
package pl.lrozek.springbootfeaturetoggle.service;

import static pl.lrozek.springbootfeaturetoggle.service.Service.toggle;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@ConditionalOnProperty(toggle)
@Component
public class AlternativeService implements Service {

    public static String alternativeService = "alternativeService";

    @Override
    public String doBusinessLogic() {
        log.info("{} invoked", alternativeService);
        return alternativeService;
    }

}
