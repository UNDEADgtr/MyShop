package by.undead.entity;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: Dzmitry
 * Date: 19.01.13
 * Time: 20:54
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "product_details")
public class ProductDetails {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private Long product_id;

    @Column
    private String title;

    @Column
    private String value;

    public ProductDetails() {
    }

    public ProductDetails(Long product_id, String title, String value) {
        super();
        this.product_id = product_id;
        this.title = title;
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductDetails that = (ProductDetails) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (product_id != null ? !product_id.equals(that.product_id) : that.product_id != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (value != null ? !value.equals(that.value) : that.value != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (product_id != null ? product_id.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ProductDetails{" +
                "id=" + id +
                ", product_id=" + product_id +
                ", title='" + title + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

}
