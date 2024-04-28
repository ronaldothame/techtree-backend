package com.cyan.techtree.Node;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NodeRepository extends JpaRepository<Node, Long> {
    List<Node> findByParentNode(Long parentNodeId);
}
