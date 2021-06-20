package UseCustomLib;

import CreateCustomJarLib.ToUppercase; //jar file lib allows us to import this package and class without instantiating

public class MainClass {
    public static void main(String[] args) {
        String test = "Reply";
        System.out.println(ToUppercase.up(test)); //call the library and the particular method you want to use

    }
}
