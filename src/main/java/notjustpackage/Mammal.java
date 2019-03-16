package notjustpackage;

public class Mammal implements Eats {
    String name;
    boolean sex=false;
    String okay;

    public Mammal() { }

    public Mammal(boolean gender){
        this.sex = gender;
    }

    public boolean getSex(){

        return sex;

    }



    public String eating() {
        return "foood";
    }

    public String getName() {
        return name;
    }
}
