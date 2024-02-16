package com.example.esercizio6;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //lombok
@AllArgsConstructor
@NoArgsConstructor
@Table //sql
@Entity
public class Enrollments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_enrollments;
    @ManyToOne
    private Student students;
    @ManyToOne
    private Classes classes;
}
