import java.util.Scanner;
import java.util.Vector;

public class Customer {	//��, ������ ��»��
	Scanner scanner = new Scanner(System.in);
	private int balance; //���� �ݾ�
	private Vector basket; //��ٱ���
	private InventoryManagement iManager;
	public Customer(InventoryManagement iManager) {	//�� ������.
		balance = 100000;
		basket = new Vector();
		this.iManager = iManager;
	}
	
	public void CustomerRun() {
		//������ Ŭ�������� ����� ����� ȣ���Ѵ�.
		//	iManager.PrintProduct(); ��.. InventoryManagement Ŭ������ �޼ҵ� ����.
		//������� �ܾ��� ����Ѵ�.
		//print balance;
		//*******
		//*�ܰ� : %d��*
		//*******
		
		//����!
		//*******
		//*�����Ͻ� ��ǰ��ȣ�� �Է��ϼ���.>>
		//
		//������� ���� �Է¹ޱ�.
		//����? ������?
		//��ٱ��Ͽ� ��´�.
		//������� ��ٱ��� Ȯ���ϱ� 
		//***��ٱ��ϸ��****
		//*��ǰ�� �ݾ� ����
		//*��ǰ�� �ݾ� ����
		//***********
		//��� ����? ���? ��������?
		//���� ��ٱ����� ����� �հ�ݾ����.
		//**�հ� : 00���Դϴ�.
		// ����Ȯ�� ���� ��� .
		//��� ���� ����, ���� �߰�.
		//�Ϸ�.
	}
	
}
