package OOPS.packagesAndEncapsulation.encapsulation;

import OOPS.packagesAndEncapsulation.learnPackage.person;

public class mainEncapsulation {  

    public static void main(String[] args) {

        person p1 = new person();

        p1.setAge(12);

        System.out.println(p1.getAge());

        System.out.println(p1.count);
        System.out.println(person.count); // Static keyword

        System.out.println(Math.max(4, 6));

    }

}
