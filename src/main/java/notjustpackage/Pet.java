package notjustpackage;

import java.security.SecureRandom;

public class Pet extends Mammal {

    String type;

    public Pet(String name, String type, boolean sex) {
        super(sex);
        this.name = name;
        this.type = type;


    }

    public String getName(){
        return name;
    }
    public String getType() {
        return type;
    }

    @Override
    public String eating() {
        return "out of a bowl";
    }


//    public Pet(Builder builder) {
//        this.name = builder.name;
//        this.type = builder.type;
//
//    }
//    public static class Builder {
//        private String type;
//        private String name;
//
//
//
//        public Builder name(String value) {
//            this.name = value;
//            return this;
//        }
//
//
//        public Builder type(String value) {
//            this.type = value;
//            return this;
//        }
//
//        public Pet build() {
//            return new Pet(this);
//        }
//      }


    }

