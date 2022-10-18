public class Main {
    public static void main(String[] args) {
        //Задание 4:
var friend = 19;
System.out.println(friend);
    friend=friend+2;
    System.out.println(friend);
        friend=friend/7;
        System.out.println(friend);
        //Задание 5:
        var frog = 3.5;
        System.out.println(frog);
        frog=frog*10;
        System.out.println(frog);
        frog=frog/3.5;
        System.out.println(frog);
        frog=frog+4;
        System.out.println(frog);
        // Задание 6:
        System.out.println("задание про боесеров или задание 6");
        var boxerweight1=78.2;
        System.out.println("Вес одного боксера " + boxerweight1+" кг.");
        var boxerweight2=82.7;
        System.out.println("Вес второго боксера " + boxerweight2+" кг.");
        var totalweight=boxerweight1+boxerweight2;
        System.out.println("общий вес двух бойцов "+totalweight+" кг.");
        var differenceweight=boxerweight1-boxerweight2;
        differenceweight=-differenceweight;
        System.out.println("разница между весами бойцов "+differenceweight+" кг.");
        // Задание 7:
        System.out.println("ЗАДАНИЕ №7");
        var weightdifference=boxerweight2-boxerweight1;
        System.out.println("Разница 1 способ "+weightdifference+" кг.");
        var weightdifference2=boxerweight2%boxerweight1;
        System.out.println("Разница ввесе с использованием остатка от деления "+weightdifference2+" кг." );
        // Задание 8:
        System.out.println("ЗАДАЧА №8");
        var totalwork=640;
        var forone=8;
        System.out.println("Всего работников в компании – "+(totalwork/forone)+" человек");
        var human=80;
        human=human+94;
        System.out.println("Если в компании работает "+human+" человек, то всего "+(human*forone)+" часов работы может быть поделено между сотрудниками");

    }
}