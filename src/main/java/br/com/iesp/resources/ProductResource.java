package br.com.iesp.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.iesp.domain.Product;
import br.com.iesp.services.ProductService;

/**
 * @author Cayo Hollanda
 *
 */
@RestController
@RequestMapping(path = "/products")
public class ProductResource {

    @Autowired
    private ProductService productService;

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Product product) {
        Product p = productService.save(product);
        return ResponseEntity.ok().body(p);
    }

    @GetMapping
    public List<Product> findAll() {
        return productService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getOne(@PathVariable Long id) {
        Product p = productService.getOne(id);
        return ResponseEntity.ok().body(p);
    }

    @DeleteMapping("/{id}")
    public void remove(@PathVariable Long id) {
        productService.delete(id);
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody Product product) {
        productService.save(product);
        return ResponseEntity.ok().body(product);
    }

}