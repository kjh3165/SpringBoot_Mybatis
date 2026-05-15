package com.springboot_mybatis.domain.post.post.repository;

import com.springboot_mybatis.domain.post.post.dto.PostWithAuthor;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PostWithAuthorRepository {
    List<PostWithAuthor> findAllWithAuthor();
    PostWithAuthor findByIdWithAuthor(int id);
}
