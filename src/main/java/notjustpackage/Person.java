package notjustpackage;

public class Person extends Mammal {

    private Person(){ }

    public Person(String name){
        this.name = name;
    }

    public Person(String name,boolean sex){
        super(sex);
        this.name = name;
    }
    public String getName() {
        return name;
    }

    @Override
    public String eating() {
        return "out of a plate";
    }
}
