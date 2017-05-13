package com.foobar.foo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "foo")
public class Foo {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="foo_id_seq")
  @SequenceGenerator(name="foo_id_seq", sequenceName="foo_id_seq", allocationSize=1)
  @Column(name = "ID")
  private Long id;

  @Column(name = "FOO")
  private String foo;

  Foo(String foo) {
    this.foo = foo;
  }

  Foo() {
    // Default constructor needed by JPA
  }

  public String getFoo() {
    return foo;
  }

}
