package test2;
//�ۼ��� ������
public abstract class Product {
	
	private int price;
	protected String prdName;	//a
	
	public abstract String sell(Object obj); //c

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}


