package com.start.st.domain.reportArticle.entity;

import com.start.st.domain.article.entity.Article;
import com.start.st.domain.member.entity.Member;
import com.start.st.global.jpa.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Getter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ReportArticle extends BaseEntity {
    @ManyToOne
    private Member author;
    @ManyToOne
    private Article article;
    private String subject;
    private String content;
}