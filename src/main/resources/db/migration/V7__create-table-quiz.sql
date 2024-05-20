CREATE table Quiz(
    id SERIAL PRIMARY KEY,
    title varchar(100),
    description varchar(1000) not null,
    node_id bigint,

    FOREIGN KEY (id_node) references Nodes (id)
);