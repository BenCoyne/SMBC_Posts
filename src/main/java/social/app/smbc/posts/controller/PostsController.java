package social.app.smbc.posts.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import social.app.smbc.posts.dto.PostDto;
import social.app.smbc.posts.service.PostsService;

@RestController
@RequestMapping("/api/posts")
@AllArgsConstructor
public class PostsController {

    private PostsService postsService;

    @PostMapping
    public ResponseEntity<PostDto> savePost(@RequestBody PostDto postDto) {
       return new ResponseEntity<>(postsService.savePost(postDto), HttpStatus.CREATED);
    }
}
