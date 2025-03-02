package com.expense.management.controller;
import com.expense.management.entity.Expense;
import com.expense.management.service.ExpenseService;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/expenses")

public class ExpenseController {
	  @Autowired
	    private ExpenseService expenseService;
	  
	  @PostMapping
	  public ResponseEntity<Expense> addExpense(@Valid @RequestBody Expense expense) {
	      return ResponseEntity.ok(expenseService.saveExpense(expense));
	  }

	  

	    @GetMapping
	    public ResponseEntity<List<Expense>> getExpenses() {
	        return ResponseEntity.ok(expenseService.getAllExpenses());
	    }

}
