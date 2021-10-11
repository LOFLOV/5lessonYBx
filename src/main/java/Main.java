public class Main {
    public static void main(String[] args) {

        Worker worker3 = new Worker("Человек говноед", "Директор",
                "alber.novus@hotmail.com", "912", 100, 35 );


        Worker [] persArray = new Worker[5];
        persArray[0] = new Worker("Алла Головач", "Директор ",
                " @gmail.com", "8800555", 1000, 25 );
        persArray[1] = new Worker("Данил Гуриев", "Директор ",
                " @gmail.com", "88005553536", 1200, 53 );
        persArray[2] = new Worker("Владислав  Самойлов", "Главный ",
                " @gmail.com", "88005553537", 1005, 43 );
        persArray[3] = new Worker("Антон Полищук", "Секретарь ",
                " @gmail.com", "88005553538", 1006, 21 );
        persArray[4] = new Worker("Тарас Шевченко", "Директор",
                " @gmail.com", "88005553539", 1007, 26 );

        // cmd + p просмотр параметров


        for (Worker worker : persArray) {
            if ((worker.age >= 40)) {
                worker.info();
            }
        }
    }

}
