package social.app.smbc.posts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import social.app.smbc.posts.entity.Post;

public interface PostsRepository extends JpaRepository<Post, Long> {
}
