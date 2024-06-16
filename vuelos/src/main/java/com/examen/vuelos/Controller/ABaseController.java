package com.examen.vuelos.Controller;

import java.util.List;




import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.examen.vuelos.Entity.ABaseEntity;
import com.examen.vuelos.IService.IBaseService;

public class ABaseController <T extends ABaseEntity, S extends IBaseService<T>> {
    
    protected S service;
    protected String entityName;
    
    protected ABaseController(S service, String entityName) {
        this.service = service;
        this.entityName = entityName;
    }
    
    @GetMapping
    public ResponseEntity<List<T>> findByStateTrue() {
        try {
            List<T> entities = service.all();
            return ResponseEntity.ok(entities);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }
    
    @GetMapping("{id}")
    public ResponseEntity<T> show(@PathVariable Long id) {
        try {
            Optional<T> entity = service.findById(id);
            if (entity.isPresent()) {
                return ResponseEntity.ok(entity.get());
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }
    
    @PostMapping
    public ResponseEntity<T> save(@RequestBody T entity) {
        try {
            T savedEntity = service.save(entity);
            return ResponseEntity.ok(savedEntity);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }
    
    @PutMapping("{id}")
    public ResponseEntity<T> update(@PathVariable Long id, @RequestBody T entity) {
        try {
            service.update(id, entity);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        try {
            service.delete(id);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }  
}