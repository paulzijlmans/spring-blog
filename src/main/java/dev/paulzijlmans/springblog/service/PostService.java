package dev.paulzijlmans.springblog.service;

import dev.paulzijlmans.springblog.domain.Post;
import dev.paulzijlmans.springblog.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;

    public void addPost(Post post) {
        postRepository.addPost(post);
    }

    public Set<Post> findAllPosts() {
        return postRepository.findAllPosts();
    }
}
