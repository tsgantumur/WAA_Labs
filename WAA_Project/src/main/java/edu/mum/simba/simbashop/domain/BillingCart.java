package edu.mum.simba.simbashop.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Getter
@Setter @NoArgsConstructor
@Entity
public class BillingCart {

    @Id
    @GeneratedValue
    private Long id;

    private String cartNumber;

    private LocalDate expDate;

    private String cartHolderName;

    private Integer securityDigits;
}
