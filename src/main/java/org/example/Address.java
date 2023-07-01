package org.example;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Date;
@Entity
@Table(name="student_address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_Id")
    private  int address;
    private int addressId;
    @Column(length = 50,name = "Street")
    private String street;
    @Column(length = 100,name="city")
    private String city;
    @Column(name="is_open")
    private boolean isOpen;
    @Transient
    private  Double x;
    @Column(name="added_date")
    @Temporal(TemporalType.DATE)
    private Date addedDate;
    @Lob
    private byte[] image;

    public Address() {
    }

    public Address(int address, String street, String city, boolean isOpen, Double x, Date addedDate, byte[] image) {
        this.address = address;
        this.street = street;
        this.city = city;
        this.isOpen = isOpen;
        this.x = x;
        this.addedDate = addedDate;
        this.image = image;
    }

    public int getAddress() {
        return address;
    }

    public void setAddress(int address) {
        this.address = address;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address=" + address +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", isOpen=" + isOpen +
                ", x=" + x +
                ", addedDate=" + addedDate +
                ", image=" + Arrays.toString(image) +
                '}';
    }
}
