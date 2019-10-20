package edu.mum.simba.simbashop.domain;

import com.sun.javafx.beans.IDProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Getter @Setter @NoArgsConstructor
@Entity
public class PaymentHistory {

    @Id
    @GeneratedValue
    private Long id;

    private LocalDate paymentDate;

    private double totalAmount;

    @OneToOne(cascade = CascadeType.ALL)
    private User user;

    @OneToOne(cascade = CascadeType.ALL)
    private Order order;

    @OneToOne(cascade = CascadeType.ALL)
    private BillingCart billingCart;

}
