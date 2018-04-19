import java.util.Scanner;

public class ShopOwner {
	Scanner scanner = new Scanner(System.in);
	
	private InventoryManagement iManager;
	public ShopOwner(InventoryManagement iManager){	//생성자.
		this.iManager = iManager;
	}
	String choice;
	
	public void OwnerRun(){
		do {
			//메뉴 출력
			//*******************
			//**1.재고확인**
			//**2.입고**
			//**3.매출액**
			//**x.나간다**
			//*******************
			//재고 확인 출력
			//입고 상품 번호와 수량 받아 처리하기
			//매출액 조회(변경 불가)
			//나간다.
		}while(!choice.equalsIgnoreCase("x"));
	}
	
	
}
