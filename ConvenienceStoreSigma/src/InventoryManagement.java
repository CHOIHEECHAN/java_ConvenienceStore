
final class InventoryManagement {	
	int sales;							//�����
	String product[][];					//��ǰ���
	
	public void InventoryManagement() {		//������ ������
		String product[][] = { 			//�迭 �ʱ�ȭ ���� �ذ��ؼ� �ۼ��Ұ�.		
				{"�̸�","����","����"},
				{"�̸�","����","����"},
				{"�̸�","����","����"},
				{"�̸�","����","����"},
				{"�̸�","����","����"},
				{"�̸�","����","����"},
		};
	}
	//
	
	
	//��ǰ ��� ����ϱ�
	public void PrintProduct() {
		//for,print�� �̿�.
		//��� ���� 
		//******************************
		//*	��ǰ��		����		���� 		*
		//*	��ǰ��		����		����		*
		//*	��ǰ��		����		����		*		
		//*	��ǰ��		����		����		*
		//*	��ǰ��		����		����		*
		//*	��ǰ��		����		����		*
		//******************************
	}
	//��ǰ ���Ȯ�ν� �����ֱ�
	public String getProduct(int pNum) {
		//return product[pNum][3] ���ڿ��ϳ� �����ֱ�.
		return "";
	}
	//��ǰ ���� �����ϱ�
	public void InProduct(int pNum, int quantity) {
		//�԰�� product[pNum][3]�� ������ ��������.
	}
	public void OutProduct(int pNum, int quantity) {
		//����(�ǸŽ�) product[pNum][3]�� ������ ��������.
	}
	
	//����� �����ϱ�
	public void addSales(int amount) {
		// ����� ����.
	}
	//�ܰ� ����ϱ�
	public void PrintSales() {
		//����� ���
	}

}
