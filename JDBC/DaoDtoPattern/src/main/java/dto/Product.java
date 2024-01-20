package dto;

public class Product {
   
	private int productId;
	private String productName;
	private double productPrice;
	public int getProductId() {
		return productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String toString(){
		return productId+"\t"+productName+"\t"+productPrice;
		
	}
}
