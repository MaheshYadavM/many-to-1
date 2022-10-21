package many.to.one.mapping.serviceimplentation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import many.to.one.mapping.entity.Account;
import many.to.one.mapping.entity.Branch;
import many.to.one.mapping.repositary.AccountRepositary;
import many.to.one.mapping.repositary.BranchRepositary;
import many.to.one.mapping.service.AccountService;
@Service
public class AccountServiceImplementaion implements AccountService {

	@Autowired
	private AccountRepositary accountRepositary;
    
	private BranchRepositary branchRepositary;
	@Override
	public Account saveAccount(Account account) {
		/*
		 * Account account1=new Account(); account1.setId(account.getId());
		 * account1.setAccountNumber(account.getAccountNumber());
		 * account1.setFullName(account.getFullName());
		 * account1.setBalence(account.getBalence());
		 * 
		 * 
		 * Branch branch=new Branch();
		 * 
		 * branch.setBranc_id(account.getBranch().getBranc_id());
		 * branch.setBranchCode(account.getBranch().getBranchCode());
		 * branch.setBranchName(account.getBranch().getBranchName());
		 * account1.setBranch(branch);
		 */
		
		
		
		return accountRepositary.save(account);

			}

	@Override
	public List<Account> findAllAccounts() {
		
		return accountRepositary.findAll();
	}

	@Override
	public Optional<Account> findByAccountId(int id) {
		
		return accountRepositary.findById(id);
	}

	@Override
	public Account updateAccount(Account account,int id) {
		 Account account1=new Account();
		 account1=accountRepositary.findById(id).orElseThrow();
		 account1.setId(account.getId());
		 account1.setAccountNumber(account.getAccountNumber());
		 account1.setFullName(account.getFullName());
		 account1.setBalence(account.getBalence());
		 
		
		 Branch branch=new Branch();
		 
		 branch.setBranc_id(account.getBranch().getBranc_id());
		branch.setBranchCode(account.getBranch().getBranchCode());
		branch.setBranchName(account.getBranch().getBranchName());
		account1.setBranch(branch);
		
		return accountRepositary.save(account1);

	}

	@Override
	public void deleteAccountdetailsId(Account account) {
		
		 accountRepositary.delete(account);;
	}

	

	

	
	
}
