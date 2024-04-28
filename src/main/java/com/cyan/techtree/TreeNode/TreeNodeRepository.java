package com.cyan.techtree.TreeNode;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TreeNodeRepository extends JpaRepository<TreeNode, Long> {
    @Query("SELECT node.nodeId FROM treenode node WHERE node.treeId = :treeId")
    List<Long> findNodeIdsByTreeId(Long treeId);
}
