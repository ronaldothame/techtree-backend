CREATE TABLE Tree_node(
    id SERIAL PRIMARY KEY,
    tree_id bigint,
    node_id bigint,

    FOREIGN KEY (tree_id) references Trees (id),
    FOREIGN KEY (node_id) references Nodes (id)
);