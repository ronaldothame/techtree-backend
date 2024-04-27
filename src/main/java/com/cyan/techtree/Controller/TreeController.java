package com.cyan.techtree.Controller;

import com.cyan.techtree.Tree.Tree;
import com.cyan.techtree.Tree.TreeDTO;
import com.cyan.techtree.Tree.TreeRepository;
import com.cyan.techtree.Tree.TreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/trees")
public class TreeController {
    @Autowired
    private TreeRepository treeRepository;

    @Autowired
    private TreeService treeService;

    @GetMapping
    public List<TreeDTO> listTrees() {
        List<Tree> trees = treeRepository.findAll();
        return trees.stream().map(treeService::mapToDTO).collect(Collectors.toList());
    }
}
