package wtf.tools.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import wtf.tools.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
