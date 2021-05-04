public class Main {
    public static void main(String[] args) {

        ReflectionChecker checker = new ReflectionChecker();

        AnyClass anyClass = new AnyClass();

        checker.showClassNAme(anyClass);
        checker.showClassFields(anyClass);
        checker.showClassMethods(anyClass);
        checker.showClassAnnotaions(anyClass);
    }
}
