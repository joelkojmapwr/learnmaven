package pt.trainings.maven.scratch;

public class HelloWorld { 
    public static void main(String[] args) {
        Integer i =5;
        Greetings greetings = new Greetings();
<<<<<<< HEAD
        System.out.println(greetings.sayHello(args.length > 0 ? args[0] : null) + "Joel was here");
=======
        System.out.println(greetings.sayHello(args.length > 2 ? args[0] : null));
>>>>>>> e227a04ec3eee52aea41b13f8378bac79fa38f12
    }
}