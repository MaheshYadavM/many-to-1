package many.to.one.mapping.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import many.to.one.mapping.entity.Account;
import many.to.one.mapping.entity.Branch;
import many.to.one.mapping.service.AccountService;

@RestController
public class AccountController {

	@Autowired
	private AccountService accountService;
	@PostMapping("addAccount")
	public Account saveAccountDetails(@RequestBody Account account) {
	    	return accountService.saveAccount(account);
	}
	@GetMapping("all")
	public List<Account> findAllAccountsIn() {
		return accountService.findAllAccounts();
	}
	@GetMapping("id")
	public Optional<Account> findGetAccountId(@RequestParam int id){
		return accountService.findByAccountId(id);
	}
	@PutMapping("update")
	public Account updateAccountDetails(@RequestBody Account account,@RequestParam int id) {
		return accountService.updateAccount(account,id);
	}
	@DeleteMapping("delete")
	public ResponseEntity<String> deleteAccountid(@RequestParam int id,Account account) {
		accountService.deleteAccountdetailsId(account);
		return new ResponseEntity<String>("Deleted succussfully",HttpStatus.OK);
	}
	
	
}
