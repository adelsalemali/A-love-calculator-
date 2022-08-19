package come.adel.formatter;

public class Format {

	String cardNo1 = "3245";
    String cardNo2 = "-9997";
    String cardNo3 = "-5548-6621";
    String cardNo4 = "5548-6621";
    
	public String getCardNo1() {
		return cardNo1;
	}
	public void setCardNo1(String cardNo1) {
		this.cardNo1 = cardNo1;
	}
	public String getCardNo2() {
		return cardNo2;
	}
	public void setCardNo2(String cardNo2) {
		this.cardNo2 = cardNo2;
	}
	public String getCardNo3() {
		return cardNo3;
	}
	public void setCardNo3(String cardNo3) {
		this.cardNo3 = cardNo3;
	}
	public String getCardNo4() {
		return cardNo4;
	}
	public void setCardNo4(String cardNo4) {
		this.cardNo4 = cardNo4;
	}
	@Override
	public String toString() {
		return   getCardNo1() + getCardNo2() + getCardNo3() + getCardNo4();
	}
    
	
    
}
