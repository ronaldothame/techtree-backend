package com.cyan.techtree.Tree;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "Trees")
@Entity(name = "tree")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Tree {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
}
