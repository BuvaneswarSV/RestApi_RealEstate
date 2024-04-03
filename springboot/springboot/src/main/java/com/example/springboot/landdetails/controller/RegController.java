package com.example.springboot.landdetails.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.landdetails.model.Reg;
import com.example.springboot.landdetails.service.RegService;


@RestController
public class RegController {
    @Autowired
    RegService ms;
    @PostMapping("/landdetails/api/product")
    public ResponseEntity<Reg>addelements(@RequestBody Reg m)
    {
        Reg mm=ms.create(m);
        return new ResponseEntity<>(mm,HttpStatus.CREATED);
    }
    @GetMapping("/landdetails/api/products")
    public ResponseEntity<List<Reg>> showinfo()
    {
        return new ResponseEntity<>(ms.getAll(),HttpStatus.OK);
    }
    @GetMapping("/landdetails/api/product/{productId}")
    public ResponseEntity<Reg> getById(@PathVariable Integer productId)
    {
        Reg obj=ms.getMe(productId);
        return new ResponseEntity<>(obj,HttpStatus.OK);
    }
    @PutMapping("/landdetails/api/product/{productId}")
    public ResponseEntity<Reg> putMethodName(@PathVariable("productId") int id, @RequestBody Reg m) {
        if(ms.updateDetails(id,m) == true)
        {
            return new ResponseEntity<>(m,HttpStatus.OK);
        }
        
        return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
    }
@DeleteMapping("/landdetails/api/product/{productId}")
    public ResponseEntity<Boolean> delete(@PathVariable("productId") int id)
    {
        if(ms.deleteProduct(id) == true)
        {
            return new ResponseEntity<>(true,HttpStatus.OK);
        }
        return new ResponseEntity<>(false,HttpStatus.NOT_FOUND);
    }
}