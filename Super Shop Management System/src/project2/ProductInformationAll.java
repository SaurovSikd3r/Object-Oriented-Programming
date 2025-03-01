package project2;

//coursename,coursetitle,coursefcaulty,coursesection,courseproduct
public class ProductInformationAll {
    
    String ProductName,ProductCode,Stores,Price,Quantity;

    public ProductInformationAll(){
        
        
    }
    
    
    public ProductInformationAll(String ProductName, String ProductCode, String Stores, String Price, String Quantity) {
        this.ProductName = ProductName+"\n";
        this.ProductCode = ProductCode+"\n";
        this.Stores = Stores+"\n";
        this.Price = Price+"\n";
        this.Quantity = Quantity+"\n";
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public String getProductCode() {
        return ProductCode;
    }

    public void setProductCode(String ProductCode) {
        this.ProductCode = ProductCode;
    }

    public String getStores() {
        return Stores;
    }

    public void setStores(String Stores) {
        this.Stores = Stores;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String Price) {
        this.Price = Price;
    }

    public String getQuantity() {
        return Quantity;
    }

    public void setQuantity(String Quantity) {
        this.Quantity = Quantity;
    }

public String toString(){
    
    return this.ProductName+"   "+this.Price+"   "+this.ProductCode+"   "+"   "+this.Stores+"   "+this.Quantity;
    
}

    
}
