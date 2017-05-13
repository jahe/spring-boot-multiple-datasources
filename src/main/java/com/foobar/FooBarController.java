package com.foobar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foobar.bar.domain.Bar;
import com.foobar.bar.repo.BarRepository;
import com.foobar.foo.domain.Foo;
import com.foobar.foo.repo.FooRepository;

@RestController
public class FooBarController {

  private final FooRepository fooRepo;
  private final BarRepository barRepo;

  @Autowired
  FooBarController(FooRepository fooRepo, BarRepository barRepo) {
    this.fooRepo = fooRepo;
    this.barRepo = barRepo;
  }

  @RequestMapping("/foobar/{id}")
  public String fooBar(@PathVariable("id") Long id) {
    Foo foo = fooRepo.findById(id);
    Bar bar = barRepo.findById(id);

    return foo.getFoo() + " " + bar.getBar() + "!";
  }

}
