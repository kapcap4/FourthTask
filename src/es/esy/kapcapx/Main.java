package es.esy.kapcapx;

import java.text.ParseException;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Computer c1 = new Computer("Asus p5+", "i3", "Nvidia 1030", 4096);
        Computer c2 = new Computer("Asus p6+", "i5", "Nvidia 1050", 8192);
        Computer c3 = new Computer("Asus p7+", "i7", "Nvidia 1080", 16384);
        c1 = c2;    //  Указатель c1 теперь указывает на тот же объект, что и указатель c2
        c2.setRam(12288);
        System.out.println(c1.toString());  //  Результат изменился, так как указатель c1 указывает на тот же объект что и c2
        c1 = null;
        System.out.println("******************************");
        System.out.println(c2.toString());  //  С объектом на который указывает c2 ничего не произошло, так как я присвоил null указателю c1
        /*  Объект на который изначально указывала ссылка c1 будет уничтожен зборщиком мусора, так как на этот объект не указывает не 1 ссылка
            объект на который указывает ссылка c3 тоже кандидат на уничтожение, так как обект на который указывает ссылка c3 не исользуется
            Если далее по коду объект на который указывает ссыдка c2 не будет использоваться, то он тоже станет кандидатом на уничтожение
            Сборщик мусора отслеживает ссылки на объекты и если они null или более не вызываются в коде, то объекты на которые указывали эти ссылки будут уничтожены
        */
        Converter converter = new Converter();
        Date date = new Date();
        System.out.println(converter.convert(5465435486684l));
        System.out.println("Номер метода который был вызван последним [" + converter.getLastMethod() + "]");
        System.out.println(converter.convert(5465435486684l, "yyyy.MM.dd"));
        System.out.println("Номер метода который был вызван последним [" + converter.getLastMethod() + "]");
        System.out.println(converter.convert(2020, 12, 13));
        System.out.println("Номер метода который был вызван последним [" + converter.getLastMethod() + "]");
        System.out.println(converter.convert(2012));
        System.out.println("Номер метода который был вызван последним [" + converter.getLastMethod() + "]");
        try {
            System.out.println(converter.convert("2018.11.13", "yyyy.MM.dd"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("Номер метода который был вызван последним [" + converter.getLastMethod() + "]");

    }
}
