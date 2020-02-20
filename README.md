# micronaut-exception-handler
Example project for exception handler behavior

This application demonstrates the following scenario:

2 ExceptionHandler instances are declared, one specific (ExceptionHandler<CustomError, HttpResponse>), 
one generic (ExceptionHandler<Throwable, HttpResponse>)

Each handler handles the exception by returning either {"handled": "Global Handler"} or {"handled": "Custom Handler"}

There is a controller with 2 endpoints global_error and custom_error, 
one throws CustomError and the other throws RuntimeException.

It is expected that hitting custom_error will return "Custom Handler" and global_error will return "Global Error"
However, If the global_error endpoint is hit first subsequent custom_error calls result in "Global Handler"
