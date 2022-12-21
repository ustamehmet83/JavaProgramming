package utilities;


import day34_GarbageCollection_AccessModifiers.AccessModifiers;

public class AccessModifiers_Test2 {
    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicData);
        //System.out.println(AccessModifiers.defaultData); not visible outside the package
        //System.out.println(AccessModifiers.privateData); not visible outside the package,also class

        AccessModifiers.method1();
        //AccessModifiers.method2();      not visible outside the package
        //AccessModifiers.method2();      not visible outside the package,also class


    }
}
