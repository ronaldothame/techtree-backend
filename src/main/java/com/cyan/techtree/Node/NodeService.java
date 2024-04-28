package com.cyan.techtree.Node;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NodeService {
    @Autowired
    private NodeRepository nodeRepository;

    public List<NodeDTO> getChildNodes(Long parentNodeId) {
        List<Node> nodes = nodeRepository.findByParentNode(parentNodeId);
        List<NodeDTO> nodeDTOs = new ArrayList<>();
        for (Node node : nodes) {
            List<NodeDTO> childNodes = getChildNodes(node.getId());
            nodeDTOs.add(new NodeDTO(node.getId(), node.getType(), node.getTitle(), node.getDescription(), childNodes));
        }
        return nodeDTOs;
    }
}
