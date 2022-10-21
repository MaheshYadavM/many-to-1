package many.to.one.mapping.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import many.to.one.mapping.entity.Account;

public interface AccountRepositary extends JpaRepository<Account, Integer>{

}
