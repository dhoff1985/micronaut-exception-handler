package micronaut.exception.handler

import io.micronaut.http.HttpRequest
import io.micronaut.http.HttpResponse
import io.micronaut.http.server.exceptions.ExceptionHandler

import javax.inject.Singleton

@Singleton
class CustomErrorExceptionHandler implements ExceptionHandler<CustomError, HttpResponse> {
  @Override
  HttpResponse handle(HttpRequest request, CustomError exception) {
    HttpResponse.ok([handled: "Custom Handler"])
  }

}
