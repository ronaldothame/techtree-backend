CREATE TABLE Nodes (
  id SERIAL PRIMARY KEY,
  type varchar(5),
  title varchar(255),
  description varchar(1000),
  parent_node bigint,
  FOREIGN KEY (parent_node) references Nodes(id)
)