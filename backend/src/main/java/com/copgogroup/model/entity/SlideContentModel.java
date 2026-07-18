package com.copgogroup.model.entity;

import com.copgogroup.model.enums.SlideType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "slide")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SlideContentModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private SlideType type;

    @Column()
    private String title;

    
    private String bodyText;
    private String verseRef;
    private String verseTagalog;

}
