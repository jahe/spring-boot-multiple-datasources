package com.foobar.foo.domain;

import javax.persistence.*;

@Entity
@Table(name = "foo")
public class Foo {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "foo_id_seq")
    @SequenceGenerator(name = "foo_id_seq", sequenceName = "foo_id_seq", allocationSize = 1)
    @Column(name = "ID")
    private Long id;

    @Column(name = "FOO")
    private String foo;

    public String getFoo() {
        return foo;
    }

}
