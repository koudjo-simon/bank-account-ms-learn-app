package ro.oks.accountservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.oks.accountservice.entities.BankAccount;

public interface BankAccountRepository extends JpaRepository<BankAccount, String> {
}
