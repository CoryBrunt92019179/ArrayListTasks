/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylisttasks;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 92019179
 */
public class ArrayListTasks {

    public static ArrayList<String> shoppingList = new ArrayList();
    public static List<String> newShoppingList = new ArrayList();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        shoppingList.add("juice");
        shoppingList.add("bread");
        shoppingList.add("butter");
        shoppingList.add("cheese");

        newShoppingList.add("bacon");
        newShoppingList.add("tomatoes");
        newShoppingList.add("eggs");
        newShoppingList.add("milk");
        newShoppingList.add("cream");
        newShoppingList.add("thyme");

        shoppingList.addAll(newShoppingList);

        shoppingList.remove(shoppingList.indexOf("bread"));
        shoppingList.remove(shoppingList.indexOf("butter"));

        printArrayList();
    }

    public static void printArrayList() {
        System.out.println(shoppingList);
    }

}
