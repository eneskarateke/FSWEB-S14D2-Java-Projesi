package com.workintech.main;

import com.workintech.model.*;

public class Main {


    public static void main(String[] args) {


        Wall wall1 = new Wall("kuzey");
        Wall wall2 = new Wall("güney");
        Wall wall3 = new Wall("doğu");
        Wall wall4 = new Wall("batı");

        Ceiling ceiling = new Ceiling(3, PaintColor.RED);
        Bed bed = new Bed("visco",2,1,2,1);
        Lamp lamp = new Lamp(false, 97, LampType.ROUND);
        Wardrobe wardrobe = new Wardrobe(2,3, 150);
        Carpet carpet = new Carpet(1,2,PaintColor.YELLOW);

        Bedroom bedroom = new Bedroom("enes", wall1,
                wall2, wall3,wall4, ceiling,bed,lamp,wardrobe,carpet);

        System.out.println("Lamba tipi(Round): " + bedroom.getLamp().getStyle());

        System.out.println("Wardrobe yükseklik:(3) " + bedroom.getWardrobe().getHeight());

        System.out.println("Bed sheets:(2) " + bedroom.getBed().getSheets());
        System.out.println("lamp) " + lamp);



    }
}