package com.foobar

import com.foobar.bar.domain.Bar
import com.foobar.bar.repo.BarRepository
import com.foobar.foo.domain.Foo
import com.foobar.foo.repo.FooRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment
import org.springframework.boot.test.web.client.TestRestTemplate
import spock.lang.Specification

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class FooBarITSpec extends Specification {

  @Autowired
  TestRestTemplate restTemplate

  @Autowired
  FooRepository fooRepo

  @Autowired
  BarRepository barRepo

  def "Insert a Foo and a Bar Entity and retrieve the resulting String via GET /foobar/1"() {
    given: "A Foo and a Bar Entity"
    fooRepo.save([
      foo: "Hello"
    ] as Foo)

    barRepo.save([
      bar: "World"
    ] as Bar)

    when: "GET /foobar/1"
    def result = restTemplate.getForObject("/foobar/1", String.class)

    then: "The result is \"Hello World!\""
    result == "Hello World!"

    cleanup:
    fooRepo.deleteAll()
    barRepo.deleteAll()
  }
}