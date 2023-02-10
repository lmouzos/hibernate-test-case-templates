package model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class Comment extends BaseObj {
	@ManyToOne
	Post post;
}
