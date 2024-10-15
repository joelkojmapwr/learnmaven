package pt.trainings.maven.scratch;

public class HelloWorld { 
    public static void main(String[] args) {
        Integer i =5;
        Greetings greetings = new Greetings();
        System.out.println(greetings.sayHello(args.length > 2 ? args[0] : null));
    }
}