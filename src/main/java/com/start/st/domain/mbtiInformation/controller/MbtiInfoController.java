package com.start.st.domain.mbtiInformation.controller;

import com.start.st.domain.mbtiInformation.service.MbtiInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class MbtiInfoController {
    private final MbtiInfoService mbtiInfoService;
}
