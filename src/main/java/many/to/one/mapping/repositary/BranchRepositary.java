package many.to.one.mapping.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import many.to.one.mapping.entity.Branch;

public interface BranchRepositary extends JpaRepository<Branch, Integer> {

}
