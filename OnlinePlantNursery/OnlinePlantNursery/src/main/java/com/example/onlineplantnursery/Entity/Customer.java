package com.example.onlineplantnursery.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer customerId;
    private String customerName;
    private String customerEmail;
    private String username;
    private String password;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(
            name = "customer_id",
            referencedColumnName = "customerId"
    )
    private List<Address> address;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(
            name = "",
            referencedColumnName = "customerId"
    )
    private List<Order> orders;
}
