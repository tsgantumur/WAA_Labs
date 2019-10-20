package edu.mum.simba.simbashop.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@Entity
public class Product {

    @Id
    @GeneratedValue

    private Long id;

    private String productName;

    private String briefInfo;

    private String detailInfo;

    private String brand;

    private Double price;

    private String image;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Review> reviewList;

    private Long numInStock;
}
