package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class productcontroller {
    @GetMapping("/{id}")
    public product getById(@PathVariable Long id){
        return new product(id,"laptop",999.99);
    }
}
