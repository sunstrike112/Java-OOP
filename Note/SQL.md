# SQL

## 1 to many

- 1 role có nhiều user
- Tạo foreign key (roleid) luôn ở bên table phía n và references đến id phía 1
 + ALTER TABLE user ADD CONSTRAINT fk_user_role FOREIGN KEY (roleid) REFERENCES role(id);


## many to many

- 1 user có nhiều comment
- 1 new có nhiều comment
- Tạo table trung gian
 + ALTER TABLE comment ADD CONSTRAINT fk_comment_user FOREIGN KEY (user_id) REFERENCES user(id);
 + ALTER TABLE comment ADD CONSTRAINT fk_comment_news FOREIGN KEY (new_id) REFERENCES news(id);