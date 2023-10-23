package lesson3;

import org.gb.lesson1.store3D.modeleElements.Color;

public class Program {
/**
 * 1. Спроектировать абстрактный класс "Car" у которого должны
 * быть свойства: марка, модель, цвет, тип кузова, число колес, тип,
 * топлива, тип коробки передач, объем двигателя; методы:
 * движения, обслуживаение, переключение передач, включение фар,
 * включение дворников.
 *
 * 2. Создать конктреный автомобиль путем наследования класса
 * "Car"
 *
 * 3. Расширить абстрактный класс "Car", добавить метод: подметать
 * улицу. Создать конктретный автомобиль путем насследования класса
 * "Car". Провести проверку принципа SRP.
 *
 * 4. Расширить абстрактный класс "Car", добавить метод:
 * включение протовотуманный фар, перевозка груза. Провести
 * проверку принципа ОСР.
 *
 * 5. Создать конкретный автомобиль путем наследование класса
 * "Car", определить число колес = 3. Провести проверку принципа LSP.
 *
 * 6. Создать конкретный автомобиль путем наследования класса "Car",
 * определить метод "движение" - "полет". Провести проверку принципа
 * LSP.
 *
 * 7. Создать интерфейс "Заправочная станция" создать метод:
 * заправка топливом
 *
 * 8. Имплеменитировать метод интерфейса "Заправочная станция" в
 * конкретный класс "Car".
 *
 * 9. Добавить в интерфейс "Заправочная станция" методы: протирка
 * лобового стекла, протирка фар, протирка зеркала.
 *
 * 10. Имплементировать все методы интерфейса "Заправочная станция"
 * в конкретный класс "Car". Провести проверку приннципа ISP. Создать
 * дополнительные интерфейсы и имплементировать их в конкретный класс
 * "Car". Провести проверку принципа ISP.
 *
 * 11. Создать путем наследования класса "Car" два автомобиля:
 * с бензиновым и дизельными топливами, имплементировать метод
 * "Заправка топливом" интерфейса "Заправочная станция". Реализовать
 * заправку каждого автомобиля подходящим топливом. Провести проверку
 * принципа DIP.
 *
 * TODO Home work
 * Доработать приложение, спроектированное на семинаре. Добавить тип, описывающий автомобиль и "автомойку".
 * Продемонстрировать работу получившейся программы, создать несколько типов автомобилей, загнать каждый автомобиль
 * на заправку, а затем и на автомойку, на станцию тех. обслуживания, придерживайтесь принципов SOLID о которых
 * мы говорили вместе на семинаре.
 * @param args
 */
public static void main(String[] args) {

    RefulingStation refulingStation = new RefulingStation();
//    Harvester harvester = new Harvester("A","B", Color.BLACK);
//    harvester.setRefuelingStation(refulingStation);
//    harvester.fuel();

//    Airplane airplane = new Airplane("C", "D", Color.WHITE);
//    airplane.setCarService();
//    airplane.service();
//
//    airplane.setRefuelingStation(refulingStation);
//    airplane.fuel();


}

    public static double calculateMaintenance(Car car){
    if (car.getWheelsCount() == 0){
        return 1500 * 6;
    }
    else {
        return 1000 * 4;
    }
    }

    }