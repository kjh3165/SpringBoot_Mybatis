package com.springboot_mybatis.domain.post.post.dto;

import com.springboot_mybatis.domain.member.member.dto.Member;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PostWithAuthor {
    private int id;
    private String title;
    private String content;
    private int MemberId;

    private LocalDateTime createDate;
    private LocalDateTime modifyDate;

    private Member author;
}
