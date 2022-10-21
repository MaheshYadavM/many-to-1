package many.to.one.mapping.service;

import java.util.List;
import java.util.Optional;

import many.to.one.mapping.entity.Account;

public interface AccountService {
	
   Account saveAccount(Account account);
   public List<Account> findAllAccounts();
   public Optional<Account> findByAccountId(int id);
   Account updateAccount(Account account,int id);
   public void deleteAccountdetailsId(Account account);
}
