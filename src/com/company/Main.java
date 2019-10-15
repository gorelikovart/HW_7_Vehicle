package com.company;

public class Main
{
    public static void main(String[] args) {

    }
    public interface Vehicle //Домен первого уровня "Транспортное средство"
    { //Общие фукции
        void drive(); //Управление
        void fuel(); //Заправка
        void service(); //Обслуживаие
    }
    public abstract class GroundVehicle implements Vehicle //Домен второго уровня Наземное ТС
    {
        @Override
        public void drive() {
            System.out.println("Рули, Педали, КПП");
        }

        @Override
        public void fuel() {
            System.out.println("Бензин, Дизель, Газ, Электричество");
        }

        @Override
        public void service() {
            System.out.println("1 раз в год / 1 раз в 6 месяцев");
        }
    }
    public class Car extends GroundVehicle //Домен третьго уровня - Авто
    {
        private class CTC{ //Внутренний класс для Автомобиля - Документ "Свидетельство Транспортного средства"
            String mark;
            String model;
            String owner;
            String vin;
        }
    }
    public class Train extends GroundVehicle //Домен третьго уровня - Поезд
    {

    }
    public class Motorbike extends GroundVehicle //Домен третьго уровня - Мотоцикл
    {

    }


    public abstract class AirVehicle implements Vehicle //Домен второго уровня Воздушное ТС
    {

    }
    public class Airplane extends AirVehicle //Домен третьго уровня - Самолет
    {
        @Override
        public void drive() {
            System.out.println("Штурвал, Педали");
        }
        @Override
        public void fuel() {
            System.out.println("Керосин");
        }
        @Override
        public void service() {
            System.out.println("Перед каждым полетом");
        }
    }
    public class Aerostat extends AirVehicle //Домен третьго уровня - Аэростат
    {
        @Override
        public void drive() {
            System.out.println("Рукоятка");
        }
        @Override
        public void fuel() {
            System.out.println("Пропан");
        }
        @Override
        public void service() {
            System.out.println("Перед каждым полетом");
        }
    }
    public class Helicopter extends AirVehicle //Домен третьго уровня - Вертолет
    {
        @Override
        public void drive() {
            System.out.println("Штурвал, Педали");
        }
        @Override
        public void fuel() {
            System.out.println("Керосин");
        }
        @Override
        public void service() {
            System.out.println("Перед каждым полетом");
        }
    }

    public abstract class WaterVehicle implements Vehicle //Домен второго уровня Водное ТС
    {

    }
    public class Rubberboar extends WaterVehicle //Домен третьго уровня - Резиновая лодка
    {
        @Override
        public void drive() {
            System.out.println("Весла");
        }
        @Override
        public void fuel() {
            System.out.println("Не требуется");
        }
        @Override
        public void service() {
            System.out.println("Перед каждым использованием");
        }
    }
    public class Ship extends WaterVehicle //Домен третьго уровня - Корабль
    {
        @Override
        public void drive() {
            System.out.println("Штувал, Рычаги");
        }
        @Override
        public void fuel() {
            System.out.println("Мазут");
        }
        @Override
        public void service() {
            System.out.println("1 раз в год");
        }
    }
    public class Waterbike extends WaterVehicle //Домен третьго уровня - Водный мотоцикл
    {
        @Override
        public void drive() {
            System.out.println("Руль, Педали");
        }
        @Override
        public void fuel() {
            System.out.println("Бензин");
        }
        @Override
        public void service() {
            System.out.println("1 раз в 6 месяцев");
        }
    }

}
