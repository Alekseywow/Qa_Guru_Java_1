package qa.guru;

import java.util.List;

public class Human {

    private static final String stateName = "Human";

    private final String name;
    private final int age;
    private final boolean isCute;

    public Human(String name, int age, boolean isCute) {
        this.name = name;
        this.age = age;
        this.isCute = isCute;
    }

    static void sayHello(){
        System.out.println("Hello, " + stateName + "!!!!");
    }


     void sayHelloNoStatic(){
        System.out.println("Hello, " + this.name + "!!!!");
    }

    public Human incremetnAge() {
        return  new Human(
                this.name,
                (this.age + 1),
                this.isCute
        );
    }

    public String getName() {
        return name;
    }

    public boolean isCute() {
        return isCute;
    }

    public int getAge() {
        return age;
    }

    void printSomeValue(int i, String str, List<String> list){
        System.out.println(i + " " + str + " " + list);
    }


    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isCute=" + isCute +
                '}';
    }
}
