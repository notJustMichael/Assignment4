package notjustpackage;


import java.util.ArrayList;

public class App
{
    public static void main( String[] args )
    {
        ArrayList<Mammal> mammals = new ArrayList<>();
        Person john = new Person("john",true);
        Pet bobby = new Pet("bobby", "doggy", true );
        Pet lassy = new Pet("Lassy", "kitty",false);

        mammals.add(john);
        mammals.add(bobby);
        mammals.add(lassy);

        for (int i=0;i<mammals.size();i++){
            System.out.println(mammals.get(i).getName()+" eats "+mammals.get(i).eating()+". This Mammal is "+ mammals.get(i).getSex());




        }


    }
}
