package com.springboot_mybatis.domain.post.post.repository;

import com.springboot_mybatis.domain.post.post.dto.Post;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface PostRepository {

    List<Post> findAll();

    Post findById(int id);

    int create(Post post);

    void createVoid(
            @Param("title") String title,
            @Param("content") String content,
            @Param("memberId") int memberId);

    int getLastInsertId();

    void deleteById(int id);

    int update(@Param("id") int id,
               @Param("title") String title,
               @Param("content") String content);

    List<Post> search(@Param("kwType") String kwType,
                      @Param("kw") String kw);

    List<Post> findAllOrdered(String orderBy, String orderOption);

    int deleteByIds(List<Integer> ids);
}
