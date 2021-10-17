package springPractive.expense;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

// This is the repository for db data, should extend jpaRepository of ExpenseEntity
// since its gonna communicate with data

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {
    List<Expense> findAll();
}
