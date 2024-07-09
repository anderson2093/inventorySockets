package company.roahn.inventoryBack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface IGenericRepo<T,UUID> extends JpaRepository<T,UUID> {
}
