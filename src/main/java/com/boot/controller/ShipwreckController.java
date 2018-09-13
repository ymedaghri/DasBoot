package com.boot.controller;

import com.boot.model.Shipwreck;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class ShipwreckController {

    @GetMapping("shipwrecks")
    public List<Shipwreck> list(){
        return ShipwreckStub.list();
    }

    @PostMapping("shipwrecks")
    public Shipwreck create(@RequestBody Shipwreck shipwreck){
        return ShipwreckStub.create(shipwreck);
    }

    @GetMapping("shipwrecks/{id}")
    public Shipwreck get(@PathVariable Long id){
        return ShipwreckStub.get(id);
    }

    @DeleteMapping("shipwrecks/{id}")
    public Shipwreck delete(@PathVariable Long id){
        return ShipwreckStub.delete(id);
    }

}
