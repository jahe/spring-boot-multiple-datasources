package com.foobar.bar.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bar")
public class Bar {

  @Id
  @GeneratedValue
  @Column(name = "ID")
  private Long id;

  @Column(name = "BAR")
  private String bar;

  Bar(String bar) {
    this.bar = bar;
  }

  Bar() {
    // Default constructor needed by JPA
  }

  public String getBar() {
    return bar;
  }
}
