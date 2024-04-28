package com.cyan.techtree.TreeNode;

import com.cyan.techtree.Node.Node;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "Tree_node")
@Entity(name = "treenode")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class TreeNode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long treeId;
    private Long nodeId;
}
