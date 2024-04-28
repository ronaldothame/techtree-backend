package com.cyan.techtree.Controller;

import com.cyan.techtree.Node.Node;
import com.cyan.techtree.Node.NodeDTO;
import com.cyan.techtree.Node.NodeRepository;
import com.cyan.techtree.Node.NodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/nodes")
public class NodeController {
    @Autowired
    private NodeRepository nodeRepository;

    @Autowired
    private NodeService nodeService;

    @GetMapping("/{id}")
    public NodeDTO getNodeById(@PathVariable Long id) {
        Node node = nodeRepository.getReferenceById(id);
        List<NodeDTO> childNodes = nodeService.getChildNodes(id);
        return new NodeDTO(node.getId(), node.getType(), node.getTitle(), node.getDescription(), childNodes);
    }
}
