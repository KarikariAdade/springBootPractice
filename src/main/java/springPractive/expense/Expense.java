package springPractive.expense;

import javax.persistence.*;
import java.math.BigDecimal;


//This is the entity, kinda like model in laravel
@Entity
@Table(name = "expenses")

public class Expense {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;

    private String expensename;

    private BigDecimal amount;

    private String note;

    private Long createdAt;

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getExpensename() {
        return expensename;
    }

    public void setExpensename(String expensename) {
        this.expensename = expensename;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }



}
