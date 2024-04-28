package com.cyan.techtree.Node;

import java.util.List;

public record NodeDTO(Long id, NodeType type, String title, String description, List<NodeDTO> childNodes) {
}
