package com.cyan.techtree.Node;

import com.cyan.techtree.TreeNode.TreeNodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class NodeService {
    @Autowired
    private NodeRepository nodeRepository;

    @Autowired
    private TreeNodeRepository treeNodeRepository;

    public List<NodeDTO> getChildNodes(Long parentNodeId) {
        List<Node> nodes = nodeRepository.findByParentNode(parentNodeId);
        List<NodeDTO> nodeDTOs = new ArrayList<>();
        for (Node node : nodes) {
            List<NodeDTO> childNodes = getChildNodes(node.getId());
            nodeDTOs.add(new NodeDTO(node.getId(), node.getType(), node.getTitle(), node.getDescription(), childNodes));
        }
        return nodeDTOs;
    }

    public List<SkillNodeDTO> getNodesByTreeId(Long treeId) {
        List<Long> nodeIds = treeNodeRepository.findNodeIdsByTreeId(treeId);
        List<SkillNodeDTO> nodes = new ArrayList<>();

        for (Long nodeId : nodeIds) {
            Node skillNode = nodeRepository.findById(nodeId).orElse(null);

            if (skillNode != null && skillNode.getType() == NodeType.SKILL) {
                List<Node> childNodes = nodeRepository.findByParentNode(skillNode.getId());

                List<TaskNodeDTO> taskNodeDTOs = childNodes.stream()
                        .filter(node -> node.getType() == NodeType.TASK)
                        .map(node -> new TaskNodeDTO(node.getId(), node.getType(), node.getTitle()))
                        .collect(Collectors.toList());

                SkillNodeDTO skillNodeDTO = new SkillNodeDTO(
                        skillNode.getId(),
                        skillNode.getType(),
                        skillNode.getTitle(),
                        taskNodeDTOs
                );
                nodes.add(skillNodeDTO);
            }
        }
        return nodes;
    }


}
