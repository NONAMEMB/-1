public class Main {
    public static void main(String[] args) {
        var box = 8;
        System.out.println(box);
        box = box + 2;
        System.out.println(box);
        box = box - 5;
        System.out.println(box);
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        dog = dog + 4.0;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 4;
        System.out.println(frog);

        var liftingCapacity = 50;
        var staffWeigth = 20;
        var capacityLeft = liftingCapacity - staffWeigth;
        System.out.println("еще можно положить " + capacityLeft + " кг вещей");

        var appleWeight = 2;
        var orangesWeight = 3;
        var fruitWeight = appleWeight + orangesWeight;
        System.out.println("общий вес фруктов " + fruitWeight);

        var meatWeight = 4;
        var waterWeight = 5;
        var tomatoesWeight = 2;
        var cucumbersWeight = 2;
        var peppersWeight = 2;
        var zucciniweight = 2;
        var vegetablesWeight = tomatoesWeight + cucumbersWeight + peppersWeight + zucciniweight;
        var productsWeight = fruitWeight + vegetablesWeight + meatWeight + waterWeight;
        System.out.println("Общий вес продуктов " +productsWeight +"кг!");

        var leftWeight = liftingCapacity - staffWeigth - productsWeight;
        System.out.println("Места осталось" + leftWeight + "кг!");

        productsWeight = productsWeight * 2;
        System.out.println("Теперь вес продуктов" + productsWeight);

        leftWeight = liftingCapacity - staffWeigth -productsWeight;
        System.out.println("Теперь места осталось" + leftWeight + "кг!");

        var overload = (staffWeigth + productsWeight) % liftingCapacity;
        System.out.println("Перегруз на" + overload + "кг!");

        var prodactsInOneCar = productsWeight / 2;
        System.out.println("Продуктов в каждой машине" + prodactsInOneCar);

        var boxerWeightOne = 78.2;
        var boxerWeightTwo = 82.7;
        var boxersWeight = boxerWeightOne + boxerWeightTwo;
        System.out.println("Общий вес боксеров" + boxersWeight + "кг!");

        var weightDifference = boxerWeightTwo - boxerWeightOne;
        System.out.println("Разница в весе" + weightDifference + "кг!");

        var staffWorkhours = 640;
        var oneStaffMember = 8;
        System.out.println(staffWorkhours);
        System.out.println(oneStaffMember);

        var staffMembers = staffWorkhours / oneStaffMember;
        System.out.println("Всего работников в компании " + staffMembers);

        var staffGroup2 = 94;
        System.out.println(staffGroup2);
        var staffGroup2WorkHours = staffGroup2 * oneStaffMember;
        System.out.println("Часы работы 2ой группы " + staffGroup2WorkHours + "часов!");
        var totalWorkHours = staffWorkhours + staffGroup2WorkHours;
        System.out.println("Общие часы работы 2х групп " + totalWorkHours + " часов!");



    }
}