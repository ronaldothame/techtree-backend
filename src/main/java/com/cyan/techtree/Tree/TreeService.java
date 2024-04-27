package com.cyan.techtree.Tree;

import org.springframework.stereotype.Service;

@Service
public class TreeService {
    public TreeDTO mapToDTO(Tree tree) {
        return new TreeDTO(
                tree.getId(),
                tree.getTitle()
        );
    }
}
