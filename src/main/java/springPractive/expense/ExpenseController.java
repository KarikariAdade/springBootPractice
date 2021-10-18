package springPractive.expense;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ExpenseController {

    @Autowired
    ExpenseService expenseService;

    @RequestMapping("/")
    public ModelAndView home(){ // ModelAndView is used when rendering an html
        ModelAndView mov = new ModelAndView("home");
        mov.addObject("message", "List of expenses");
        mov.addObject("anothermessage", "This is another message");
        List<Expense> expenses = expenseService.findAll();
        mov.addObject("expenses", expenses);
        return mov;
    }

    @RequestMapping("expense/create")
    //Create a service method to store data
    public ModelAndView createExpense(){
        ModelAndView mov = new ModelAndView("expense/create");
        mov.addObject("message", "Add Expense");
        mov.addObject("expense", new Expense());
        return mov;
    }


    @RequestMapping(method = RequestMethod.POST, value = "expense/create")
    // Model attribute, as used in the form tag is used to map the form to the service
    // Its just like one of the requests parameters in laravel
    public String save(@ModelAttribute("expense") Expense expense){
        expenseService.save(expense);
        return "redirect:/";
    }


    @RequestMapping("expense/edit/{id}")
    public ModelAndView edit(@PathVariable("id") Long id){
        ModelAndView mov = new ModelAndView("expense/edit");
        Expense expense = expenseService.findById(id);
        mov.addObject("expense", expense);
        return mov;
    }

}
