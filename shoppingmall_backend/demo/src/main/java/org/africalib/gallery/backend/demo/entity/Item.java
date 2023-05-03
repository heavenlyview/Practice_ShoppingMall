package org.africalib.gallery.backend.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Getter
@Entity
@Table(name = "items") // 클래스와 items 테이블 매핑
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 자동증가값
    private int id; // columns에 있는 id와 매핑

    @Column(length = 50, nullable = false)
    private String name; // 멤버변수 추가

    @Column(length = 100)
    private String imgPath;
    
    @Column
    private int price;

    @Column
    private int discountPer;
}