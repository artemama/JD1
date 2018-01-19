package workclasspvt.factory;

public class Main {

	public static void main(String[] args) {

		Car test = CarFactory.build(CarType.LUXURY); // создаем объект Кар, вызываем метод Билд в КарФактори,
														// Запрашивает Тип Енума

	}

}
