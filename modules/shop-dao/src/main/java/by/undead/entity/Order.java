package by.undead.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created with IntelliJ IDEA.
 * User: Dzmitry
 * Date: 19.01.13
 * Time: 21:45
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private Timestamp timestamp;

    @Column
    private String email;

    @Column
    private Float price = 0f;

    @Column
    private String name;

    @Column
    private String phone;

    @Column
    private String description;

    @Column
    private String status;

    public Order() {
    }

    public Order(Timestamp timestamp, String email, Float price, String name, String phone, String description, String status) {
        this.timestamp = timestamp;
        this.email = email;
        this.price = price;
        this.name = name;
        this.phone = phone;
        this.description = description;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (description != null ? !description.equals(order.description) : order.description != null) return false;
        if (email != null ? !email.equals(order.email) : order.email != null) return false;
        if (id != null ? !id.equals(order.id) : order.id != null) return false;
        if (name != null ? !name.equals(order.name) : order.name != null) return false;
        if (phone != null ? !phone.equals(order.phone) : order.phone != null) return false;
        if (price != null ? !price.equals(order.price) : order.price != null) return false;
        if (status != null ? !status.equals(order.status) : order.status != null) return false;
        if (timestamp != null ? !timestamp.equals(order.timestamp) : order.timestamp != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (timestamp != null ? timestamp.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", timestamp=" + timestamp +
                ", email='" + email + '\'' +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
