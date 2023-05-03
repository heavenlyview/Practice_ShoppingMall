package org.africalib.gallery.backend.demo.repository;

import org.africalib.gallery.backend.demo.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer>{
    
}
