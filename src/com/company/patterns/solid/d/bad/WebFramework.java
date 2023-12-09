package com.company.patterns.solid.d.bad;

//The Dependency Inversion principle states that our classes depend upon interfaces or abstract classes instead of concrete classes
public class WebFramework {

    public void save(ModelForm form) {
        MySql db = new MySql();
        db.save(form);
    }

    public void save(Loan loan) {
        MySql db = new MySql();
        db.save(loan);
    }

    public void save(Payment payment) {
        MySql db = new MySql();
        db.save(payment);
    }
}
