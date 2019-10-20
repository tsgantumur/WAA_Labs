package edu.mum.simba.simbashop.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter @Setter @NoArgsConstructor
@Entity
public class Phone {

    @Id
    @GeneratedValue

    private Long id;

    private String areaCode;

    private String prefix;

    private String number;

}
