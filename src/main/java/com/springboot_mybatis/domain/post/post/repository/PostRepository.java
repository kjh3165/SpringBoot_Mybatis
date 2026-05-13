package com.springboot_mybatis.domain.post.post.repository;

import com.springboot_mybatis.domain.post.post.dto.Post;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PostRepository {

    @Select("""
    <script>
    SELECT * 
    FROM post
    </script>
    """)
    List<Post> findAll();
}
