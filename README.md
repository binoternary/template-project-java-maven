# Java application template

## Features

* Code style enforced with **Checkstyle** - runs automatically on `mvn compile`
* Static code analysis with **Spotbugs** - `mvn compile spotbugs:check`, `mvn spotbugs:gui` to see results
* Mutation tests with **PIT** (experimental) - `mvn compile pitest:mutationCoverage`, see results in `target/pit-reports`
* App packaged to uberjar - `mvn clean package`
* Configured with **lightben config** library (default configuration in [reference.conf](src/main/resources/reference.conf))
* Run app with `java -Dconfig.file=path/to/application.conf -jar target/template-project-java-maven-*.jar`
