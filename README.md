This project serves as a test playground for external configuration properties support in [NB Spring Boot](https://github.com/AlexFalappa/nb-springboot) plugin.

The project simply declares a set of `@ConfigurationProperties` annotated classes and a `@CommandLineRunner` istance that autowires and prints the values of all the properties objects