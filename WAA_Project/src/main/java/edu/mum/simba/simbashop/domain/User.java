package edu.mum.simba.simbashop.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
    private String username;
    private String password;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Address> billingAddress;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Address> shippingAddress;

    @OneToOne
    private Phone phone;

    @Enumerated(EnumType.STRING)
    private Role role;

    private String permission;

    @OneToOne(cascade = CascadeType.ALL)
    private ShoppingCart shoppingCart;

    private Double coupon;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Order> orderList;

    @OneToMany(cascade = CascadeType.ALL)
    private List<BillingCart> billingCartList;

    @OneToMany(cascade = CascadeType.ALL)
    private List<User> followedSellerList;



}
