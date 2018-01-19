package workclasspvt.patterns;

public class SingletonSample {

	private static SingletonSample instance = new SingletonSample(); // достучаться можем, можем создать только 1 объект
																		// = это синглтон паттерн
//такой синглтон используется 
	private SingletonSample() {

	}
	public static SingletonSample getInstance() {
		// TODO Auto-generated method stub
		return null;
	}

	/*public synchronized static SingletonSample getInstance() { // synchronized плохо - т.к. может быть Дэд лок //
																// synchronized надо использовать только при многопотоке

		if (instance == null) { // - этот метод - ЛЕНИВАЯ ЗАГРУЗКА LAZY LOADING
			instance = new SingletonSample();

		}
		return instance;
	}*/

}
