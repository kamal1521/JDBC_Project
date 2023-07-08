package model;

public class product 
{
   private int productId;
   private String porductName;
   private int minSellQuantity;
   private int price;
   private int qulatity;
   public int getProductId() {
	   return productId;
   }
   public void setProductId(int productId){
	   this.productId=productId;
   }
public String getPorductName() {
	return porductName;
}
public void setPorductName(String porductName) {
	this.porductName = porductName;
}
public int getMinSellQuantity() {
	return minSellQuantity;
}
public void setMinSellQuantity(int minSellQulatity) {
	this.minSellQuantity = minSellQulatity;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getQulatity() {
	return qulatity;
}
public void setQulatity(int qulatity) {
	this.qulatity = qulatity;
}
}
