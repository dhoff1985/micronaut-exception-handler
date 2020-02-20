package micronaut.exception.handler

import io.micronaut.http.HttpRequest
import io.micronaut.http.HttpResponse
import io.micronaut.http.server.exceptions.ExceptionHandler

import javax.inject.Singleton

@Singleton
class GlobalExceptionHandler implements ExceptionHandler<Throwable, HttpResponse> {
  @Override
  HttpResponse handle(HttpRequest request, Throwable exception) {
    HttpResponse.ok([handled: "Global Handler"])
  }

}
