package Products;

import java.util.Objects;

public class Products {
    private  String name;
    private int price;
    //private int count;

    public Products(int price) {
        this.price = price;
    }

    public Products(String name, int price, int count) {
        if (name == null || name.isEmpty() || name.isBlank()) {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        } else {
            this.name = name;
        }
        if (price <= 0) {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        } else {
            this.price = price;
        }
        //if (count <= 0) {
        //            throw new IllegalArgumentException("Заполните карточку товара полностью");
        //        } else {
        //            this.count = count;
        //        }
        }



    public String getName () {
            return name;
        }


        public int getPrice () {
            return price;
        }

        public void setPrice ( int price) {
            if (price <= 0) {
                throw new IllegalArgumentException("Заполните карточку товара полностью");
            } else {
                this.price = price;
            }
        }
       // public int getCount () {
          //  return count;
       // }


        @Override
        public boolean equals (Object o){
            if (this == o) return true;
            if (!(o instanceof Products)) return false;
            Products products = (Products) o;
            return  name.equals(products.name);
        }

        @Override
        public int hashCode () {
            return Objects.hash(name);
        }

        @Override
        public String toString () {
            return "Название продукта " +
                    name + '\'' +
                    ", цена " + price +
                    '}';
        }
    }
