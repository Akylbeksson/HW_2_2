package com.company;

public class Main {

    public static void main(String[] args) {

        createObject("Apple").print();
        createObject("Orange").print();
        createObject("Banana").print();
    }

    public static Printable createObject(String className) {

        Printable print = null;
        switch (className) {
            case "Apple":
                print = new Apple("Issyk-kul", "green", 7);
                break;
            case "Orange":
                print = new Orange("Turkish", "sweet", 8);
                break;
            case "Banana":
                print = new Banana("Chinese", 100, 10);
                break;
        }
        return print;
    }
   }




/*b)  Создать 2х уровневую иерархию из 4х классов (1й - родитель --> 2й, 3й, 4й - дочерние, с отличающимися полями).
c)  Создать Интерфейс Printable с методом void print();
d)  Реализовать интерфейс Printable классами 2й, 3й и 4й, переопределить метод интерфейса так чтобы он распечатывал всю информацию о свойствах объекта.
e)  В классе Main создать возвращаемый метод createObject(String className), который умеет создавать объекты класса 2й, 3й и 4й и после создания и
задания свойств объекту метод возвращает ссылку на объект (пульт).
Можно использовать switch для того чтоб определить какого типа нужно создать экземпляр объекта.
Например если в параметре передается “2й” метод должен создать объект именно этого типа.
f)  В главном классе Main создать 3 различных объекта классов 2й, 3й и 4й с помощью метода createObject, и распечатать по ним информацию методом print();*/