package com.foobar.bar.domain;

import javax.persistence.*;

@Entity
@Table(name = "bar")
public class Bar {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bar_id_seq")
    @SequenceGenerator(name = "bar_id_seq", sequenceName = "bar_id_seq", allocationSize = 1)
    @Column(name = "ID")
    private Long id;

    @Column(name = "BAR")
    private String bar;

    public String getBar() {
        return bar;
    }
}
