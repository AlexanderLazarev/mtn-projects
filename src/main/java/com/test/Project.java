package com.test;

//dependency on Apache commons-collections
import org.apache.commons.collections.Predicate;

class Project {

  public static void test() {
    System.out.println("test");
  }
  
  public static void main(String[] args) {
    AtomicInteger aInt1 = new AtomicInteger(0);
    AtomicInteger aInt2 = new AtomicInteger(0);
    if (aInt1.equals(aInt2)) {;}

    System.out.println("Hellow MTN");
  }

}