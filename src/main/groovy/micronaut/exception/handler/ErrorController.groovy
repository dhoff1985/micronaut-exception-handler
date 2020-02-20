package micronaut.exception.handler

import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller
class ErrorController {

  @Get("/global_error")
  HttpResponse getGlobalError() {
    throw new RuntimeException("foo")
  }

  @Get("/custom_error")
  HttpResponse getCustomError() {
    throw new CustomError()
  }
}
