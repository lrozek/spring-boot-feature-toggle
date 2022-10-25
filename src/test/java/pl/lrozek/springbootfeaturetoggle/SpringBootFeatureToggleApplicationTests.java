package pl.lrozek.springbootfeaturetoggle;

import static java.lang.String.format;
import static java.util.Optional.empty;
import static java.util.Optional.of;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static pl.lrozek.springbootfeaturetoggle.service.AlternativeService.alternativeService;
import static pl.lrozek.springbootfeaturetoggle.service.DefaultService.defaultFeature;
import static pl.lrozek.springbootfeaturetoggle.service.Service.toggle;

import java.util.Optional;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.boot.SpringApplication;

import pl.lrozek.springbootfeaturetoggle.service.Service;

class SpringBootFeatureToggleApplicationTests {

    @MethodSource("args")
    @ParameterizedTest
    public void itShouldToggleFeature(Optional<String> arg, String expectedResult) {
        // given
        String[] args = arg.map(this::map).orElseGet(() -> new String[0]);
        Service service = SpringApplication.run(SpringBootFeatureToggleApplication.class, args).getBean(Service.class);

        // when
        String result = service.doBusinessLogic();

        // then
        assertThat(result, equalTo(expectedResult));
    }

    private static Object[][] args() {
        return new Object[][] {
                new Object[] { empty(), defaultFeature },
                new Object[] { of(format("--%s=%s", toggle, false)), defaultFeature },
                new Object[] { of(format("--%s=%s", toggle, true)), alternativeService },
        };
    }

    private String[] map(String string) {
        return new String[] { string };
    }

}
