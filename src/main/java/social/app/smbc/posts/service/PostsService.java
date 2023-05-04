package social.app.smbc.posts.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import social.app.smbc.posts.dto.PostDto;
import social.app.smbc.posts.entity.Post;
import social.app.smbc.posts.repository.PostsRepository;

@AllArgsConstructor
@Service
public class PostsService {

    private PostsRepository postsRepository;

    public PostDto savePost(PostDto postDto) {
        Post savedPost = new Post(
                postDto.getId(),
                postDto.getPostText(),
                postDto.getCreatedAtDate()
        );

        postsRepository.save(savedPost);

        PostDto savedPostDto = new PostDto(
                savedPost.getId(),
                savedPost.getPostText(),
                savedPost.getCreatedAtDate()
        );

        return savedPostDto;
    }

}
