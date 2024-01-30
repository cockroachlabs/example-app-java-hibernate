package com.cockroachlabs;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Random;
import java.util.function.Function;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.JDBCException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

// Account is our model, which corresponds to the "accounts" database table.
@Entity
@Table(name = "accounts")
public class Account {

    @Id
    @Column(name = "id")
    public long id;

    public long getId() {
        return id;
    }

    @Column(name = "balance")
    public BigDecimal balance;

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal newBalance) {
        this.balance = newBalance;
    }

    // Convenience constructor.
    public Account(int id, int balance) {
        this.id = id;
        this.balance = BigDecimal.valueOf(balance);
    }

    // Hibernate needs a default (no-arg) constructor to create model objects.
    public Account() {
    }
}
