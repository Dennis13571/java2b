package Java12;

public class Class17 {
    public static void main(String[] args) {
        String a = "262904713";
        short b = Short.parseShort(a);
        System.out.println(b);
        /*
         * Exception in thread "main" java.lang.NumberFormatException: Value out of
         * range. Value:"262904713" Radix:10
         * at java.base/java.lang.Short.parseShort(Short.java:139)
         * at java.base/java.lang.Short.parseShort(Short.java:163)
         * at Java12.Class17.main(Class17.java:6)
         */
    }
}
