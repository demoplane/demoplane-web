package com.game.plane.entity;

import com.game.plane.enums.FactType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name = "fact")
public class Fact{

    public static final String FACT_TYPE = "fact_tp";
    public static final String FACT_SEQUENCE = "fact_seq";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = FACT_TYPE)
    private FactType factType;

    @Column(name = FACT_SEQUENCE)
    private Integer factSequence;

    @Transient
    private String factContent;
}
