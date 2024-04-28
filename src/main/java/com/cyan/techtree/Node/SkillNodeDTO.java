package com.cyan.techtree.Node;

import java.util.List;

public record SkillNodeDTO(Long id, NodeType type, String title, List<TaskNodeDTO> childNodes) {}
