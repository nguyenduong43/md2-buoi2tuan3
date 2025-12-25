package qlsanpham;

import java.util.*;

public class TestProduct {
    public static void main(String[] args) {
        Product p1 = new Product(1,"but",1000);
        Product p2 = new Product(2,"vo",10000);
        Product p3 = new Product(3,"sach",5000);
        List <Product> products = new ArrayList<Product>();
        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.remove(p1);
        p2.setId(4);
        int kt=0;
        Collections.sort(products);
        for(Product p:products){
            System.out.println(p.toString());
        }
        for(Product p:products){
            System.out.println(p.toString());
            if (p.timkiem("but",p.getName())==1){
                System.out.println("tim duoc san pham"+p.toString());
                kt=1;
                break;
            }
        }
        if (kt==0) System.out.println("khong tim dc san pham");

    }
}
