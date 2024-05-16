package Lab7_1;

import java.util.Arrays;

public class Aircraft {

    private String nameAicraft;

    public Aircraft(String nameAicraft) {
        this.nameAicraft = nameAicraft;
    }

    public String getNameAicraft() {
        return this.nameAicraft;
    }

   public class Wing {
        private int wingWeight;

        public void setWingWeight(int wingWeight) {
            this.wingWeight=wingWeight;
        }

        public String getWingWeight() {
            return String.format("Вес крыла самолета: %s кг", this.wingWeight);
        }


    }


    public static void main(String[] args) {


        Aircraft Boing = new Aircraft("Боинг");
        Aircraft.Wing boingWing = Boing.new Wing();
        boingWing.setWingWeight(20000);
        System.out.println("Самолет: " + Boing.getNameAicraft());
        System.out.println(boingWing.getWingWeight());

        Aircraft AirBus = new Aircraft("Айробас");
        Aircraft.Wing airbusWing = AirBus.new Wing();
        boingWing.setWingWeight(21000);
        System.out.println("Самолет: " +  AirBus.getNameAicraft());
        System.out.println(boingWing.getWingWeight());;

    }

}
