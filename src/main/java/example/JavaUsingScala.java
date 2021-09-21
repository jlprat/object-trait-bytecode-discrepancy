package example;

public class JavaUsingScala {
    public static void main(String[] args) {
        // This compiles in Scala 2.13 and 3.0.2
        System.out.println(ObjectClassPair.Constant());
        // This compiles in Scala 2.13 and 3.0.2
        System.out.println(ObjectTraitPair$.MODULE$.Constant());
        // This compies in Scala 2.13 but not in 3.0.2
        System.out.println(ObjectTraitPair.Constant());
    }
}
