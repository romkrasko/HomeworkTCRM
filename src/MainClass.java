public class MainClass {
    public static void main(String[] args){

        Cat[] cats = new Cat[10];
        cats[0] = new Cat();
        cats[1] = new Cat("Pushok","Male");
        cats[2] = new Cat("Pushok","Female","Britain",true);
        cats[3] = new Cat("Barsik","Female","Pers",true);
        cats[4] = new Cat("Pushok2","Female","Britain",false);
        cats[5] = new Cat("Marusya","Male","Britain",true);
        CatCafe cafe = new CatCafe("address1",cats,"13:00-16:00",cats.length);

        Person owner = new Person("personName");

        System.out.println(cats[0].isInCafe());
        cats[0].setInCafe(false);
        System.out.println(cats[0].isInCafe());
        cats[0].setInCafe(true);
        System.out.println(cats[0].isInCafe());
        cats[0].takeAwayFromCafe(owner);
        System.out.println(cats[0].isInCafe());
        cafe.printCatsInCafe("Britain");
    }
}

/*
Создать объекты классов Cat, Lynx, Dog. Добавить вывод в консоль: тип животного, что говорит животное, и владельца (для домашних). Вывод реализовать методом info (класса Animal)
*/