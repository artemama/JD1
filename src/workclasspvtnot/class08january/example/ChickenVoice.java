package workclasspvtnot.class08january.example;


public class ChickenVoice	//Класс с методом main()
{
	
	public static void main(String[] args)
	{
		EggVoice eggVoiiceThread = new EggVoice();	//Создание потока
		System.out.println("Спор начат...");
		eggVoiiceThread.start(); 			//Запуск потока
		
		for(int i = 0; i < 5; i++)
		{
			try{
				Thread.sleep(1000);		//Приостанавливает поток на 1 секунду
			}catch(InterruptedException e){}
			
			System.out.println("курица!");
		}
		
		//Слово «курица» сказано 5 раз

		if(eggVoiiceThread.isAlive())	//Если оппонент еще не сказал последнее слово
		{
			try{
				eggVoiiceThread.join();	//Подождать пока оппонент закончит высказываться.
			}catch(InterruptedException e){}
			
			System.out.println("Первым появилось яйцо!");
		}
		else	//если оппонент уже закончил высказываться
		{
			System.out.println("Первой появилась курица!");
		}
		System.out.println("Спор закончен!");	
	}
}