import java.util.Scanner;

public class ConvenienceStore {

	public static void main(String[] args) {
		InventoryManagement iManager = new InventoryManagement();
		Customer customer = new Customer(iManager);
		ShopOwner owner = new ShopOwner(iManager);
		int choice = 0;
		Scanner scanner = new Scanner(System.in);
		//ȭ�� �������
		//*********
		//****ConvenienceStore*****
		//*********�����:0 ����:1
		//*******������ �Է��ϼ���.>
		//������ �Է�
		
		//�������� ���� �����, ���� ó���� �̵�.
		switch (choice) {
		case 0:
			customer.CustomerRun();
			break;
		case 1:
			owner.OwnerRun();
			break;
		default:
			break;
		}
		//���α׷� ����.
	}
}
