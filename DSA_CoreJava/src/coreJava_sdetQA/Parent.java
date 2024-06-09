package coreJava_sdetQA;

class Parent {
    public static void staticMethod() {
        System.out.println("Parent's static method");
    }
}
class Child extends Parent {
    public static void staticMethod() {
    	 System.out.println("Child's static method");
    }
}
