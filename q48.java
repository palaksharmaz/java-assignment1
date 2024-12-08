interface Interface1 {
    void method1();
    void method2();
}
interface Interface2 {
    void method3();
    void method4();
}
interface Interface3 {
    void method5();
    void method6();
}
interface CombinedInterface extends Interface1, Interface2, Interface3 {
    void method7();
}
class ConcreteClass {
    void concreteMethod() {
        System.out.println("Concrete class method.");
    }
}
class ImplementingClass extends ConcreteClass implements CombinedInterface {
    public void method1() {
        System.out.println("Method 1 from Interface1");
    }

    public void method2() {
        System.out.println("Method 2 from Interface1");
    }

    public void method3() {
        System.out.println("Method 3 from Interface2");
    }

    public void method4() {
        System.out.println("Method 4 from Interface2");
    }

    public void method5() {
        System.out.println("Method 5 from Interface3");
    }

    public void method6() {
        System.out.println("Method 6 from Interface3");
    }

    public void method7() {
        System.out.println("Method 7 from CombinedInterface");
    }
}
public class q48 {
    static void testInterface1(Interface1 obj) {
        obj.method1();
        obj.method2();
    }

    static void testInterface2(Interface2 obj) {
        obj.method3();
        obj.method4();
    }

    static void testInterface3(Interface3 obj) {
        obj.method5();
        obj.method6();
    }

    static void testCombinedInterface(CombinedInterface obj) {
        obj.method1();
        obj.method2();
        obj.method3();
        obj.method4();
        obj.method5();
        obj.method6();
        obj.method7();
    }

    public static void main(String[] args) {
        ImplementingClass obj = new ImplementingClass();

        testInterface1(obj);
        testInterface2(obj);
        testInterface3(obj);
        testCombinedInterface(obj);

        obj.concreteMethod();
    }
}
