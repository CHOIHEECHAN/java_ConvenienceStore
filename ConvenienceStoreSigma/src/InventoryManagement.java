
final class InventoryManagement {	
	int sales;							//매출액
	String product[][];					//상품목록
	
	public void InventoryManagement() {		//재고관리 생성자
		String product[][] = { 			//배열 초기화 문제 해결해서 작성할것.		
				{"이름","가격","수량"},
				{"이름","가격","수량"},
				{"이름","가격","수량"},
				{"이름","가격","수량"},
				{"이름","가격","수량"},
				{"이름","가격","수량"},
		};
	}
	//
	
	
	//제품 목록 출력하기
	public void PrintProduct() {
		//for,print문 이용.
		//출력 예제 
		//******************************
		//*	제품명		가격		수량 		*
		//*	제품명		가격		수량		*
		//*	제품명		가격		수량		*		
		//*	제품명		가격		수량		*
		//*	제품명		가격		수량		*
		//*	제품명		가격		수량		*
		//******************************
	}
	//제품 재고확인시 보내주기
	public String getProduct(int pNum) {
		//return product[pNum][3] 문자열하나 보내주기.
		return "";
	}
	//제품 수량 변경하기
	public void InProduct(int pNum, int quantity) {
		//입고시 product[pNum][3]의 수량을 변경하자.
	}
	public void OutProduct(int pNum, int quantity) {
		//출고시(판매시) product[pNum][3]의 수량을 변경하자.
	}
	
	//매출액 변경하기
	public void addSales(int amount) {
		// 매출액 증가.
	}
	//잔고 출력하기
	public void PrintSales() {
		//매출액 출력
	}

}
