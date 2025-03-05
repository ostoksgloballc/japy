
public class Lion {  //Class method and constructor.

    String name;
    Integer age;
    Double weight;


    Lion(String name, int age, double weight) {  //these are some perimeter set up on this line
        //"this" is key word used to assign a value to specific object. object here is "Lion" while values are "name, age, and weight".
        this.name = name;
        this.age = age;
        this.weight = weight;

        System.out.println(this.name + " " + this.age + " " + this.weight);
    }//how to access an object attribute within it class itself, we use "this". E.g (this.name+ "whatever we want to write")
//
//    void eat(){
//        System.out.println(this.name+" is eating");
//    }
//    void walk(){
//        System.out.println(this.name+" is walking");
//    }
//    void drinking() {
//        System.out.println(this.name+ " is drinking");
//    }
}

//public class Lion {
//    String continent;
//    String nation;
//    String state;
//    int population;
//    float salary;
//
//
//
//    Lion(String continent, String nation, String state, int population, Float salary) {
//        this.continent = continent;
//        this.nation = nation;
//        this.state = state;
//        this.population = population;
//        this.salary = salary;
//
////        System.out.println(this.continent + " " + this.nation + " " + this.state + " " + this.population+ " " + this.salary);
//
//
//    }
//    void Rich(){
//        System.out.println(this.continent+ " is Rich");
//    }
//    void Blessed(){
//        System.out.println(this.nation + " is Blessed");
//    }
//    void Smart(){
//        System.out.println(this.state + " is Smart");
//
//    }
//    void Spirit(){
//        System.out.println(this.continent + " is filled with the Spirit");
//    }
//}
//
//
