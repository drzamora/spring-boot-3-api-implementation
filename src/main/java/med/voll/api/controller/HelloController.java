package med.voll.api.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    @Operation(summary = "Obtiene los registros del medico con ID")
    public String helloWorld() {
        return "Hello world from Mexico!";
    }

}
