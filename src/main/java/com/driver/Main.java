package com.driver;

public class Main {
    public static class Product{
      public int product(int x,int y){
          int prod=x*y;
          return prod;
      }
      public int product(int x,int y,int z){
          int produ=x*y*z;
          return produ;
      }

      public double product(double x,double y){
          double prod=x*y;
          return prod;
      }
    }
      public static void main(String[] args){
          Product p=new Product();
          int ans = p.product(4,5);


          int find=p.product(2,3,4);


          double del=p.product(6.5,4.5);


          System.out.println(ans +" "+ find+" "+ del);
      }

}