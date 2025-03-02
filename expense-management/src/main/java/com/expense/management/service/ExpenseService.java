package com.expense.management.service;
import com.expense.management.entity.Expense;
import com.expense.management.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ExpenseService {
	  @Autowired
	    private ExpenseRepository expenseRepository;

	    public Expense saveExpense(Expense expense) {
	        return expenseRepository.save(expense);
	    }

	    public List<Expense> getAllExpenses() {
	        return expenseRepository.findAll();
	    }
	

}
