package CreateCustomJarLib;

import java.util.Arrays;

public class ToUppercase {
    public static void main(String[] args) { //useful when executing custom jar lib in command line
        String toUp =up(Arrays.toString(args));
        toUp = toUp.replace("[","");
        toUp = toUp.replace("]","");
        System.out.println(toUp);
    }

    public static String up(String a){
        a = a.toUpperCase();
        return a;
    }
}
