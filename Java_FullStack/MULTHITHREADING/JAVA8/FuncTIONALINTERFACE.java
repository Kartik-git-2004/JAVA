package MULTHITHREADING.JAVA8;
@FunctionalInterface
public interface FuncTIONALINTERFACE {

    void greetings(String name );


    public static void main(String[] args) {

        FuncTIONALINTERFACE g = (name)->
            System.out.println("HELLO "+name);
g.greetings("kartik");
    }
}



