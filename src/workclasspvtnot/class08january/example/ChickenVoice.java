package workclasspvtnot.class08january.example;


public class ChickenVoice	//����� � ������� main()
{
	
	public static void main(String[] args)
	{
		EggVoice eggVoiiceThread = new EggVoice();	//�������� ������
		System.out.println("���� �����...");
		eggVoiiceThread.start(); 			//������ ������
		
		for(int i = 0; i < 5; i++)
		{
			try{
				Thread.sleep(1000);		//���������������� ����� �� 1 �������
			}catch(InterruptedException e){}
			
			System.out.println("������!");
		}
		
		//����� ������� ������� 5 ���

		if(eggVoiiceThread.isAlive())	//���� �������� ��� �� ������ ��������� �����
		{
			try{
				eggVoiiceThread.join();	//��������� ���� �������� �������� �������������.
			}catch(InterruptedException e){}
			
			System.out.println("������ ��������� ����!");
		}
		else	//���� �������� ��� �������� �������������
		{
			System.out.println("������ ��������� ������!");
		}
		System.out.println("���� ��������!");	
	}
}