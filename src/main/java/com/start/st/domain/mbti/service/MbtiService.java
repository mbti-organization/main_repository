package com.start.st.domain.mbti.service;

import com.start.st.domain.mbti.entity.Mbti;
import com.start.st.domain.mbti.repository.MbtiRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MbtiService {
    private final MbtiRepository mbtiRepository;

    //MBTI요소
    public List<String> getElements(String name) {
        List<String> elements = new ArrayList<>();
        for (int i = 0; i < name.length(); i++) {
            switch (name.charAt(i)) {
                case 'I':
                    elements.add("Introversion(내향)");
                case 'E':
                    elements.add("Extraversion(외향)");
                case 'S':
                    elements.add("Sensing(감각)");
                case 'N':
                    elements.add("iNtuition(직관)");
                case 'T':
                    elements.add("Thinking(사고)");
                case 'F':
                    elements.add("Felling(감정)");
                case 'J':
                    elements.add("Judging(판단)");
                case 'P':
                    elements.add("Perceiving(인식)");
            }
        }
        return elements;
    }

    //만들어질 때, 요소도 같이 만들어짐
    public void create(String name) {
        List<String> elements = new ArrayList<>();
        elements = this.getElements(name);
        Mbti mbti = Mbti.builder()
                .name(name)
                .build();
        this.mbtiRepository.save(mbti);
    }


    public List<Mbti> findAllMbti() {
        return this.mbtiRepository.findAll();
    }


    public Mbti getMbti(Long id) {
        Optional<Mbti> mbti = this.mbtiRepository.findById(id);
        if (mbti.isEmpty()) {
            return null;
        }
        return mbti.get();
    }
}
