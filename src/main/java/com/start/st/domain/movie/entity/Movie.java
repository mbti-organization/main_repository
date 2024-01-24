package com.start.st.domain.movie.entity;

import com.start.st.domain.mbti.entity.Mbti;
import com.start.st.global.jpa.BaseEntity;
import jakarta.persistence.Column;
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
public class Movie extends BaseEntity {
    @Column(length = 200)
    private String name;
}
