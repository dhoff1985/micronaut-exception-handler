package micronaut.exception.handler

import io.micronaut.http.client.RxHttpClient
import io.micronaut.http.client.annotation.Client
import io.micronaut.test.annotation.MicronautTest
import spock.lang.Specification

import javax.inject.Inject

@MicronautTest
class CustomErrorHandlerSpec extends Specification {

  @Inject
  @Client('/')
  RxHttpClient client

  def "handles global exception and custom exception with respective handlers" () {
    expect:
    client.toBlocking().exchange("global_error", Map).body().handled == "Global Handler"
    client.toBlocking().exchange("custom_error", Map).body().handled == "Custom Handler"
  }

}
