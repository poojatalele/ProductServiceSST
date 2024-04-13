package com.sst.productservicesst.models;

import com.mysql.cj.protocol.x.XProtocolDecoder;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
//    @OneToMany(fetch = FetchType.EAGER)
//    private List<Product> products;
}
