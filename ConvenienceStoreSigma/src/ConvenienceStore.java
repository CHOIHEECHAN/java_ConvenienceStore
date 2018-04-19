import java.util.Scanner;

public class ConvenienceStore {

	public static void main(String[] args) {
		InventoryManagement iManager = new InventoryManagement();
		Customer customer = new Customer(iManager);
		ShopOwner owner = new ShopOwner(iManager);
		int choice = 0;
		Scanner scanner = new Scanner(System.in);
		//화면 문자출력
		//*********
		//****ConvenienceStore*****
		//*********사용자:0 점주:1
		//*******선택을 입력하세요.>
		//선택지 입력
		
		//선택지에 따라 사용자, 점주 처리로 이동.
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
		//프로그램 종료.
	}
}
