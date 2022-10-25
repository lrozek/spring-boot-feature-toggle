# spring-boot-feature-toggle

# how to run it

- with Command line arguments:

  - `java -jar target/spring-boot-feature-toggle.jar`
  - `java -jar target/spring-boot-feature-toggle.jar --app.alternative.feature.enabled=false`
  - `java -jar target/spring-boot-feature-toggle.jar --app.alternative.feature.enabled=true`

- with Java System properties:

  - `java -jar target/spring-boot-feature-toggle.jar`
  - `java -Dapp.alternative.feature.enabled=false -jar target/spring-boot-feature-toggle.jar`
  - `java -Dapp.alternative.feature.enabled=true -jar target/spring-boot-feature-toggle.jar`

- with OS environment variables:

  - `java -jar target/spring-boot-feature-toggle.jar`
  - `APP_ALTERNATIVE_FEATURE_ENABLED=false java -jar target/spring-boot-feature-toggle.jar`
  - `APP_ALTERNATIVE_FEATURE_ENABLED=true java -jar target/spring-boot-feature-toggle.jar`

- with application properties:
  - `java -jar target/spring-boot-feature-toggle.jar`
  - `java -jar target/spring-boot-feature-toggle.jar --spring.config.additional-location=togle/off.yaml`
  - `java -jar target/spring-boot-feature-toggle.jar --spring.config.additional-location=toggle/on.yaml`
