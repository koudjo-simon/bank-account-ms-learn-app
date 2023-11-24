package ro.oks.customerservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import ro.oks.customerservice.config.GlobalConfig;
import ro.oks.customerservice.entities.Customer;
import ro.oks.customerservice.repository.CustomerRepository;

import java.util.List;

@SpringBootApplication
@EnableConfigurationProperties(
        GlobalConfig.class
)
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
        return args -> {

            List<Customer> customerList = List.of(
                    Customer.builder()
                            .firstname("Simon")
                            .lastname("ODOH")
                            .email("simon@gmail.com")
                            .build(),
                    Customer.builder()
                            .firstname("Petro")
                            .lastname("ODOH")
                            .email("petro@gmail.com")
                            .build()
            );

            customerRepository.saveAll(customerList);
        };
    }

}
