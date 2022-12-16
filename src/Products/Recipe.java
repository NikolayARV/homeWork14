package Products;

import java.util.HashMap;
import java.util.Objects;
import Products.Products.*;
public class Recipe  {
    private String name;
    private ProductList productList;
    private Integer totalCost=0;

    public Recipe(String name, ProductList productList) {
        this.name = name;
        this.productList = productList;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    @Override
    public String toString() {
        return "Рецепт " +
                 name +
                ": " + productList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Recipe)) return false;
        Recipe recipe = (Recipe) o;
        return name.equals(recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
