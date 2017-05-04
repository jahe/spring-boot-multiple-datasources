package com.foobar.foo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "foo")
public class Foo {

  @Id
  @GeneratedValue
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
