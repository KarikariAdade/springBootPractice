package springPractive.expense;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// This implements service
@Service
public class ExpenseServiceImplementation implements ExpenseService{
    @Autowired
    ExpenseRepository expenseRepository;

    @Override
    public List<Expense> findAll() {
        return expenseRepository.findAll();

    }

    @Override // Saves the expense
    public void save(Expense expense) {
        expenseRepository.save(expense);
    }
}
