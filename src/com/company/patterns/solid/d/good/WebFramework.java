package com.company.patterns.solid.d.good;

public class WebFramework {

    public void save(FormInterface formInterface) {
        SqlInterface db = new MySql();
        db.save(formInterface);
    }
}
