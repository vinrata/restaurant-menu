package org.launchcode.java.studios;

public class MenuItem {
    private String name;
    private String description;
    private String category;
    private Double price = 0.0;
    private Boolean isNew;



    public MenuItem(String name, String description, Double price){
        this.name = name;
        this.description = description;
        this.price = price;

        this.category = "not categorized";
        this.isNew = false;

    }
    public MenuItem(String name, String description, Double price, String category, Boolean isNew){
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.isNew = isNew;
    }


//methods
    //getters and setters
    public String getName(){return this.name;}
    public void setName(String name){this.name = name;}

    public String getDescription(){return this.description;}
    public void setDescription(String name){this.description = description;}

    public Double getPrice(){return this.price;}
    public void setPrice(Double price){this.price = price;}

    public String getCategory(){return this.category;}
    public void setCategory(String category){this.category = category;}

    public Boolean getIsNew(){return this.isNew;}
    public void setIsNew(boolean isNew){this.isNew = isNew;}


    public boolean dateSwitch(Boolean isNew) {
        this.isNew = true;
        return this.isNew;
    }

    @Override
    public String toString() {
        String returnString ="";
        returnString += "Item Name: " + this.name + "\n";
        returnString += "Item Description: " + this.description + "\n";
        returnString += "Item Price: " + this.price + "\n";
        returnString += "Item Category: " + this.category + "\n";
        returnString += "Item Is New?: " + this.isNew + "\n";
        return returnString;

    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if(!(obj instanceof MenuItem)){
            return false;
        }
        MenuItem menuItem = (MenuItem) obj;
        if(menuItem.name.equals(this.name)
                && menuItem.description.equals(this.description)
                && menuItem.price.equals(this.price)
                && menuItem.category.equals(this.category))
                return true;
                else return false;

    }
}
