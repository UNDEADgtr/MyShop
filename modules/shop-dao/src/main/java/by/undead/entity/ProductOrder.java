package by.undead.entity;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: Dzmitry
 * Date: 19.01.13
 * Time: 21:55
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "product_orders")
public class ProductOrder {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private Integer number;

    @Column
    private Float price;

    @OneToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "product_id")
    private Product product;

    public ProductOrder() {
    }

    public ProductOrder(Integer number, Float price, Product product) {
        this.number = number;
        this.price = price;
        this.product = product;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductOrder that = (ProductOrder) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (number != null ? !number.equals(that.number) : that.number != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (product != null ? !product.equals(that.product) : that.product != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (number != null ? number.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (product != null ? product.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ProductOrder{" +
                "id=" + id +
                ", number=" + number +
                ", price=" + price +
                ", product=" + product +
                '}';
    }
}
