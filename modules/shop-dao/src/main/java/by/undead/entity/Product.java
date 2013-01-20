package by.undead.entity;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: Dzmitry
 * Date: 19.01.13
 * Time: 21:10
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String title;

    @Column
    private Long price;

    @Column
    private String discription;

    @Column
    private String imagePath;


    public Product() {
    }

    public Product(String title, Long price, String discription, String imagePath) {
        super();
        this.title = title;
        this.price = price;
        this.discription = discription;
        this.imagePath = imagePath;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (discription != null ? !discription.equals(product.discription) : product.discription != null) return false;
        if (id != null ? !id.equals(product.id) : product.id != null) return false;
        if (imagePath != null ? !imagePath.equals(product.imagePath) : product.imagePath != null) return false;
        if (price != null ? !price.equals(product.price) : product.price != null) return false;
        if (title != null ? !title.equals(product.title) : product.title != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (discription != null ? discription.hashCode() : 0);
        result = 31 * result + (imagePath != null ? imagePath.hashCode() : 0);
        return result;
    }


}
