package com.springboot_mybatis.domain.post.post.service;

import com.springboot_mybatis.domain.post.post.dto.PostWithAuthor;
import com.springboot_mybatis.domain.post.post.repository.PostWithAuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class PostWithAuthorService {
    private final PostWithAuthorRepository postWithAuthorRepository;

    public List<PostWithAuthor> findAllWithAuthor() {
        return postWithAuthorRepository.findAllWithAuthor();
    }
}
