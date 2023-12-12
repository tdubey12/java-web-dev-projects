package org.launchcode;

import java.time.LocalDate;
import java.util.Objects;

public class MenuItem {

    public static final int MENU_ITEM_IS_NEW_DAYS=90;

    private String name;
    private String description;
    private double price;
    private String category;
    private LocalDate addedDate;



    public MenuItem(String name, String description, double price, String category) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.addedDate=LocalDate.now();
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getDescription() {

        return description;
    }

    public void setDescription(String description) {

        this.description = description;
    }

    public double getPrice() {

        return price;
    }

    public void setPrice(double price) {

        this.price = price;
    }

    public String getCategory() {

        return category;
    }

    public void setCategory(String category) {

        this.category = category;
    }

    public boolean isNew() {
        //how to find  item is new or not and compare it with how many days old
        if(addedDate.isBefore(LocalDate.now().plusDays(+MENU_ITEM_IS_NEW_DAYS))) {
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Objects.equals(name, menuItem.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", addedDate=" + addedDate +
                '}';
    }
}
