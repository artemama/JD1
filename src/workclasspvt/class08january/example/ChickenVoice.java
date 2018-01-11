package workclasspvt.class08january.example;

public class ChickenVoice // ����� � ������� main()
{

	public static void main(String[] args) throws InterruptedException {
		EggVoice eggVoiiceThread = new EggVoice(); // �������� ������
		System.out.println("���� �����...");
		eggVoiiceThread.start(); // ������ ������

		for (int i = 0; i < 5; i++) {
			Thread.sleep(1000); // ���������������� ����� �� 1 �������

			System.out.println("������!");
		}

		// ����� ������� ������� 5 ���

		if (eggVoiiceThread.isAlive()) // ���� �������� ��� �� ������ ��������� �����
		{
			eggVoiiceThread.join(); // ��������� ���� �������� �������� �������������.

			System.out.println("������ ��������� ����!");
		} else // ���� �������� ��� �������� �������������
		{
			System.out.println("������ ��������� ������!");
		}
		System.out.println("���� ��������!");
	}
}