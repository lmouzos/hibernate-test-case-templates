package model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.Set;

@Entity
public class Post extends BaseObj {
	@OneToMany(mappedBy = "post")
	Set<Comment> comments;
}
