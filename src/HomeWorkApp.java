import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

public class HomeWorkApp {
    public static void main(String[] args) {

    Employee Worker1 = new Employee("Иванов Александр", "Дизайнер", "IA@ya.ru", "8-901-888-88-88", 120000, 45);
    Employee Worker2 = new Employee("Погодина Мария", "Разработчик", "PM@ya.ru", "8-905-555-55-66", 89000, 26);
    Employee Worker3 = new Employee("Новиков Максим", "Тестировщик", "NM@ya.ru", "8-965-865-65-65", 152000, 38);
    Employee Worker4 = new Employee("Володин Виктор", "Аналитик", "VV@ya.ru", "8-951-951-95-95", 159000, 60);


    Worker1.info();
    Worker2.info();
    Worker3.info();
    Worker4.info();

    System.out.println();
    initWorkers();
    }
    public static void initWorkers () {
        Employee [] AllWorkers = new Employee[5];
        AllWorkers[0] = new Employee("Сотиков Павел", "Дизайнер", "SP@ya.ru", "8-956-956-54-54", 32000, 23);
        AllWorkers[1] = new Employee("Сотикова Эльвира", "Аналитик", "SE@ya.ru", "8-975-753-51-51", 65000, 27 );
        AllWorkers[2] = new Employee("Выхухоль Аркадий", "Тестировщик", "VA@ya.ru", "8-963-962-12-12", 456050, 45);
        AllWorkers[3] = new Employee("Смит Валерий", "Дизайнер", "SV@ya.ru", "8-753-753-85-85", 456210, 52);
        AllWorkers[4] = new Employee("Адамов Лев", "Директор", "AL@ya.ru", "8-900-100-20-20", 753000, 49);

        for (int i = 0; i < AllWorkers.length; i++){
            if (AllWorkers[i].age > 40){
                AllWorkers[i].info();
            }
        }
    }




}
