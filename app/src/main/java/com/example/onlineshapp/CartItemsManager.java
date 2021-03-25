package com.example.onlineshapp;

import java.util.ArrayList;
import java.util.List;

public class CartItemsManager {

    public static List<Product> retrieveCartItems() {
        List<Product> cartItems = new ArrayList<>();

        retrieveCartItemsFrom(cartItems, SuperGlobals.shoesList);
        retrieveCartItemsFrom(cartItems, SuperGlobals.bagsList);
        retrieveCartItemsFrom(cartItems, SuperGlobals.topsList);
        retrieveCartItemsFrom(cartItems, SuperGlobals.bottomsList);

        return cartItems;
    }

    private static void retrieveCartItemsFrom(List<Product> cartItems, List<Product> productList) {
        for (Product product: productList) {
            if (product.isAddedToCart()) {
                cartItems.add(product);
            }
        }
    }

    public static double retrieveProductsTotal(List<Product> productList) {
        double total = 0;

        for (Product product: productList) {
            if (product.isAddedToCart()) {
                total += product.getProdPrice();
            }
        }

        return total;
    }

}
