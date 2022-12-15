package Products;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ProductList {
    private HashMap<Products, Integer> productList;

    private int totalCost=0;

    public ProductList(HashMap<Products, Integer> productList) {

        this.productList = productList;
    }

    public HashMap<Products, Integer> getProductList() {
        return productList;
    }

    public void setProductList(HashMap<Products, Integer> productList) {
        this.productList = productList;
    }

    public void sumTotalCost() {
        for (Map.Entry<Products, Integer> count : productList.entrySet()) {
           totalCost = count.getKey().getPrice()*count.getValue()+totalCost;
        }

        System.out.println(totalCost);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductList)) return false;
        ProductList that = (ProductList) o;
        return totalCost == that.totalCost && productList.equals(that.productList) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(productList,  totalCost);
    }

    @Override
    public String toString() {
        return "ProductList{" +
                "productList=" + productList +
                '}';
    }
}

