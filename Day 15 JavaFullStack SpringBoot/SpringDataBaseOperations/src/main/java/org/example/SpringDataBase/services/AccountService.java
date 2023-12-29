package org.example.SpringDataBase.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.example.SpringDataBase.models.Account;
import org.example.SpringDataBase.repositories.AccountRepository;


@Service
public class AccountService {
    @Autowired(required = true)
    private AccountRepository accountRepository;

    public Account save(Account account){
        return accountRepository.save(account);
    }
}
