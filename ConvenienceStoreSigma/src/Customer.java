import java.util.Scanner;
import java.util.Vector;

public class Customer {	//고객, 물건을 사는사람
	Scanner scanner = new Scanner(System.in);
	private int balance; //소유 금액
	private Vector basket; //장바구니
	private InventoryManagement iManager;
	public Customer(InventoryManagement iManager) {	//고객 생성자.
		balance = 100000;
		basket = new Vector();
		this.iManager = iManager;
	}
	
	public void CustomerRun() {
		//재고관리 클래스에서 재고목록 출력을 호출한다.
		//	iManager.PrintProduct(); 등.. InventoryManagement 클래스의 메소드 참조.
		//사용자의 잔액을 출력한다.
		//print balance;
		//*******
		//*잔고 : %d원*
		//*******
		
		//시작!
		//*******
		//*구매하실 상품번호를 입력하세요.>>
		//
		//사용자의 선택 입력받기.
		//고른다? 나간다?
		//장바구니에 담는다.
		//사용자의 장바구니 확인하기 
		//***장바구니목록****
		//*상품명 금액 수량
		//*상품명 금액 수량
		//***********
		//계속 쇼핑? 계산? 시작으로?
		//계산시 장바구니의 내용과 합계금액출력.
		//**합계 : 00원입니다.
		// 구매확인 구매 취소 .
		//재고 수량 수정, 매출 추가.
		//완료.
	}
	
}
