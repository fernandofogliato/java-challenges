package br.com.fogliato;

//import java.io.*;
//class B {
//    void x(int i) throws IOException {
//        if(i<0) return;
//        this.x(-1);
//        System.out.println("c");
//    }
//}
//abstract class C extends B {
//    void x(int i) throws IOException {
//        System.out.println("b");
//        super.x(i);
//    }
//}
//abstract class D extends C {
//    void x(int i) throws IOException {
//        super.x(i);
//    }
//}
//class E extends D {
//}
//class A {
//    public static void main(String[] args) throws IOException  {
//        new E().x(32);
//    }
//}
//


interface Veiculo {
    int getMarcha();
    void liga();
}

abstract class Carro implements Veiculo {
    public void liga()  {
        System.out.println("ligado!");
    }
}

class CarroConcreto extends Carro implements Veiculo {
    public int getMarcha() {
        return 1;
    }
}


//interface Z {}
//interface W {}
//interface Y extends Z, W {}
//class B {}
//class C extends B implements Y {}
//class D extends B implements Z, W {}
//class E extends C {}
//class A {
//    public static void main(String[] args) {
//        System.out.println(((B) (Z) (W) (Y) new D()) instanceof D);
//    }
//}



public class Test {

    public static void main(String[] args) {
        int a = Integer.parseInt("10",2);
        int b = a == 10 ? null : 3;
        System.out.println(a + b);
    }
}


class MyException extends RuntimeException {

}

class Testes {
    public static void main(String[] args) {
        System.out.println(new char[]{'a','b','c'}); // A
        System.out.println(new byte[]{'a','b','c'}); // B
        System.out.println("abc"); // C
        System.out.println(new String[]{"abc"}); // D
    }
}