package AbstractClass.AnonymousClasses;

public class Outher {
    private int i;

    public void doSomething(){
        final int localVar = 84;

        class Inner{
            public void innerMethod(){
                i = 7;
                System.out.println(localVar);
            }
        }
    }
}
