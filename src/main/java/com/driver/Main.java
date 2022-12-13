package com.driver;

public class Main {
    public static class Product{

        public void product(int x, int y) { }
        public void product(int x, int y, int z) {}
        public void product(double x, double y) {}
    }
    public static void main(String[] args) {
        Product p = new Product();
        p.product(1,2);
        p.product(1,2,3);
        p.product(1.2233,4545.44);
    }
}