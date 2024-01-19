package com.start.st.domain.mbtiInformation.entity;

import com.start.st.domain.mbti.entity.Mbti;
import com.start.st.global.jpa.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Getter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class MbtiInformation extends BaseEntity {
    @Column(unique = true, columnDefinition = "TEXT")
    private String content;
    @OneToOne
    @JoinColumn(name = "mbti_id") //정보는 mbti에 의존적
    private Mbti mbti;
}
