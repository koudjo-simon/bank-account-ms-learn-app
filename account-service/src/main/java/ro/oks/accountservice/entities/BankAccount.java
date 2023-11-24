package ro.oks.accountservice.entities;

import jakarta.persistence.*;
import lombok.*;
import ro.oks.accountservice.enums.AccountType;
import ro.oks.accountservice.model.Customer;

import java.time.LocalDate;

@Entity
@Getter @Setter @ToString @NoArgsConstructor @AllArgsConstructor @Builder
public class BankAccount {
    @Id
    private String accountId;
    private double balance;
    private LocalDate createAt;
    private String currency;
    @Enumerated(EnumType.STRING)
    private AccountType type;
    @Transient
    private Customer customer;
    private Long customerId;
}
