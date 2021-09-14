package org.launchcode.java.studios;

public class Restaurant {
    public static void main(String[] args){

        MenuItem item1 = new MenuItem("Giant Burger", "Big cheeseburger for everyone to share", 19.99, "entree", true);
        MenuItem item2 = new MenuItem("Giant Burger", "Big cheeseburger for everyone to share", 19.99, "entree", true);
        MenuItem item3 = new MenuItem("Chocolate Chess Pie", "Chocolate pudding pie put back in the over to add texture", 9.99, "dessert", true);
        //restaurantMenu.addItem(burger);
        Menu myMenu = new Menu();
        myMenu.addMenuItem(item1);
        myMenu.addMenuItem(item2);
        myMenu.addMenuItem(item3);

        System.out.println(myMenu.toString());
        System.out.println(item1.toString());

        //System.out.println(item1.toString());
        //System.out.println(item1.equals(item2));
        //System.out.println(item1.equals(item3));



    }

}
