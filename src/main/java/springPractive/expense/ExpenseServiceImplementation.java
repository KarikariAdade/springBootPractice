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
        expense.setCreatedAt(System.currentTimeMillis());
        expenseRepository.save(expense);
    }

    @Override
    public Expense findById(Long id) {
        if (expenseRepository.findById(id).isPresent()){
            return expenseRepository.findById(id).get();
        }
        return null;
    }
}
