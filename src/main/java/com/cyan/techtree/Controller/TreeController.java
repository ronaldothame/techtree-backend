package com.cyan.techtree.Controller;

import com.cyan.techtree.Node.NodeService;
import com.cyan.techtree.Node.SkillNodeDTO;
import com.cyan.techtree.Tree.Tree;
import com.cyan.techtree.Tree.TreeDTO;
import com.cyan.techtree.Tree.TreeRepository;
import com.cyan.techtree.Tree.TreeService;
import com.cyan.techtree.TreeNode.TreeNodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin
@RestController
@RequestMapping("/trees")
public class TreeController {
    @Autowired
    private TreeRepository treeRepository;

    @Autowired
    private TreeNodeRepository treeNodeRepository;

    @Autowired
    private TreeService treeService;

    @Autowired
    private NodeService nodeService;

    @GetMapping
    public List<TreeDTO> listTrees() {
        List<Tree> trees = treeRepository.findAll();
        return trees.stream().map(treeService::mapToDTO).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public List<SkillNodeDTO> getNodesByTreeId(@PathVariable Long id) {
        return nodeService.getNodesByTreeId(id);
    }
}
