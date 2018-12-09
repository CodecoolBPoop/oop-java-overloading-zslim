package com.codecool.uml.overloading;

import java.util.Date;

public class FeaturedProductCategory extends ProductCategory {

    private Date startDate;
    private Date endDate;

    public void schedule(Date startDate, Date endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FeaturedProductCategory:");
        sb.append("id=").append(id);
        sb.append(",name=").append(name);
        sb.append(",department=").append(department);
        sb.append(",description=").append(description);
        sb.append(",startDate=").append(startDate);
        sb.append(",endDate=").append(endDate);
        return sb.toString();
    }
}
