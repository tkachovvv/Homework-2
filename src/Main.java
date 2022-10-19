public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        paper = paper + 4;
        System.out.println(paper);
        cat = cat + 4;
        System.out.println(cat);
        dog = dog + 4;
        System.out.println(dog);
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = (friend + 2)/7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = (frog * 10) / 3.5 + 4;
        System.out.println(frog);
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var totalWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println(totalWeight);
        var differenceInWeight = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница в весе бойцов составляет: " + differenceInWeight + "кг ");
        var differenceInWeight2 = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Разница в весе бойцов составляет: " + differenceInWeight2 + "кг ");
        var theAmountOfTime = 640;
        var timeAtWork = 8.0;
        var theNumberOfEmployees = theAmountOfTime / timeAtWork;
        System.out.println("Всего работников в компании: " + theNumberOfEmployees + " человек ");
        var theUpdatedTimeAtWork = theAmountOfTime / (theNumberOfEmployees + 94);
        System.out.println("Если в компании работают " + (theNumberOfEmployees + 94) + " человека, " + "то всего " + theUpdatedTimeAtWork + " часов работы может быть поделено между сотрудниками");
    }
}
