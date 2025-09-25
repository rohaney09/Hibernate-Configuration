package org.example;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
@Table (name="std_address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_ID")
    private int addressId;
    @Column(length = 50, name = "STREET")
    private String street;
    @Column(length = 100, name = "CITY")
    private String city;
    @Column(name = "is_Open")
    private Boolean isOpen;
    @Transient
    private double x;
    @Temporal(TemporalType.DATE)
    private Date addedDate;
    @Lob
    private byte[] image;

}
