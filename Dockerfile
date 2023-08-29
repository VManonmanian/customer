FROM eclips-temurin:17
COPY target/customer.jar customer.jar
CMD ["java","-jar","customer.jar"]