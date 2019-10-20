package edu.mum.simba.simbashop.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter @Setter @NoArgsConstructor
@Entity
public class Order {

    @Id
    @GeneratedValue
    private Long id;

    private Double amount;

    private LocalDate date;

    private String orderNumber;

    @OneToOne(cascade = CascadeType.ALL)
    private ShoppingCart shoppingCart;

}
