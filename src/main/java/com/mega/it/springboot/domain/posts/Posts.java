package com.mega.it.springboot.domain.posts;


import com.mega.it.springboot.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor // public Posts(){} 만듬 생성자
public class Posts extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder // 게터세터 대신에 클래스안에 클래스 넣어줘서 보안강화 디자인패턴
    public Posts(String title, String content, String author){
        this.title = title;
        this.content=content;
        this.author=author;
    }

    public void update(String title, String content){
        this.title = title;
        this.content=content;
    }



}