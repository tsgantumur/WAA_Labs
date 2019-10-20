package edu.mum.simba.simbashop.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Getter @Setter @NoArgsConstructor
@Entity
public class Review {

    @Id
    @GeneratedValue
    private Long id;

    private String comment;

    private Integer rate;

    @OneToOne
    private User user;

}
