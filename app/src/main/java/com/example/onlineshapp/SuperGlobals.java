package com.example.onlineshapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SuperGlobals {

    public static double totalPrice;

    public static List<Product> shoesList = new ArrayList<>(Arrays.asList(
            new Product(
                    1,
                    "Black leather office shoes",
                    "lorem ipsum",
                    1000,
                    R.drawable.s1,
                    false
            ),
            new Product(
                    2,
                    "Plan black leather shoesProduct 2",
                    "lorem ipsum",
                    999,
                    R.drawable.s2,
                    false
            ),
            new Product(
                    3,
                    "White nike rubber shoes",
                    "lorem ipsum",
                    2000,
                    R.drawable.s3,
                    false
            ),
            new Product(
                    4,
                    "Gold heels",
                    "lorem ipsum",
                    5000,
                    R.drawable.s4,
                    false
            ),
            new Product(
                    5,
                    "Gray heels",
                    "lorem ipsum",
                    800,
                    R.drawable.s5,
                    false
            ),
            new Product(
                    6,
                    "Black white rubber shoes",
                    "lorem ipsum",
                    1500,
                    R.drawable.s6,
                    false
            )
    ));

    public static List<Product> bagsList = new ArrayList<>(Arrays.asList(
            new Product(
                    1,
                    "Small messenger bag",
                    "lorem ipsum",
                    1500,
                    R.drawable.b1,
                    false),
            new Product(
                    2,
                    "Double travel bag",
                    "lorem ipsum",
                    2000,
                    R.drawable.b2,
                    false),
            new Product(
                    3,
                    "Pink fashionista bag",
                    "lorem ipsum",
                    1000,
                    R.drawable.b3,
                    false),
            new Product(
                    4,
                    "Brown messenger bag",
                    "lorem ipsum",
                    2000,
                    R.drawable.b4,
                    false),
            new Product(
                    5,
                    "Channel boy travel bag",
                    "lorem ipsum",
                    2500,
                    R.drawable.b5,
                    false),
            new Product(
                    6,
                    "Louie style black bag",
                    "lorem ipsum",
                    1000,
                    R.drawable.b6,
                    false)
    ));

    public static List<Product> topsList = new ArrayList<>(Arrays.asList(
            new Product(
                    1,
                    "Beige lace top",
                    "lorem ipsum",
                    800,
                    R.drawable.t1,
                    false),
            new Product(
                    2,
                    "Black crop top",
                    "lorem ipsum",
                    500,
                    R.drawable.t2,
                    false),
            new Product(
                    3,
                    "Black office dress",
                    "lorem ipsum",
                    1500,
                    R.drawable.t3,
                    false),
            new Product(
                    4,
                    "White sleeves for men",
                    "lorem ipsum",
                    1000,
                    R.drawable.t4,
                    false),
            new Product(
                    5,
                    "White designed polo",
                    "lorem ipsum",
                    900,
                    R.drawable.t5,
                    false),
            new Product(
                    6,
                    "Black adidas tshirt",
                    "lorem ipsum",
                    1000,
                    R.drawable.t6,
                    false)
    ));

    public static List<Product> bottomsList = new ArrayList<>(Arrays.asList(
            new Product(
                    1,
                    "Saggy pants",
                    "lorem ipsum",
                    2100,
                    R.drawable.p1,
                    false),
            new Product(
                    2,
                    "Denim tattered pants",
                    "lorem ipsum",
                    900,
                    R.drawable.p2,
                    false),
            new Product(
                    3,
                    "Loose men pants",
                    "lorem ipsum",
                    1000,
                    R.drawable.p3,
                    false),
            new Product(
                    4,
                    "Fitted women jeans",
                    "lorem ipsum",
                    1000,
                    R.drawable.p4,
                    false),
            new Product(
                    5,
                    "Adidas jogging pant",
                    "lorem ipsum",
                    800,
                    R.drawable.p5,
                    false),
            new Product(
                    6,
                    "Denim tattered pants",
                    "lorem ipsum",
                    999,
                    R.drawable.p6,
                    false)
    ));

}
