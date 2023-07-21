package com.mega.it.springboot.web.dto;


import com.mega.it.springboot.domain.posts.Posts;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class PostsListResponseDto {

    private Long id;
    private String title;
    private String author;
    private LocalDateTime modifiedDate;

    public PostsListResponseDto(Posts entity){
        this.id=entity.getId();
        this.title=entity.getTitle();
        this.modifiedDate=entity.getModifiedDate();
        this.author=entity.getAuthor();
    }
}