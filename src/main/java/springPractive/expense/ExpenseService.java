package springPractive.expense;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ExpenseService {
    List<Expense> findAll();

    void save(Expense expense); // After this, go to implementation class to implement it

    Expense findById(Long id);
}
