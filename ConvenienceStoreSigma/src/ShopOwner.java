import java.util.Scanner;

public class ShopOwner {
	Scanner scanner = new Scanner(System.in);
	
	private InventoryManagement iManager;
	public ShopOwner(InventoryManagement iManager){	//������.
		this.iManager = iManager;
	}
	String choice;
	
	public void OwnerRun(){
		do {
			//�޴� ���
			//*******************
			//**1.���Ȯ��**
			//**2.�԰�**
			//**3.�����**
			//**x.������**
			//*******************
			//��� Ȯ�� ���
			//�԰� ��ǰ ��ȣ�� ���� �޾� ó���ϱ�
			//����� ��ȸ(���� �Ұ�)
			//������.
		}while(!choice.equalsIgnoreCase("x"));
	}
	
	
}
