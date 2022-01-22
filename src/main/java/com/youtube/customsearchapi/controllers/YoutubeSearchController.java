package com.youtube.customsearchapi.controllers;

import com.youtube.customsearchapi.misc.ResponseObj;
import com.youtube.customsearchapi.dto.YoutubeSearchResultDto;
import com.youtube.customsearchapi.service.YoutubeSearchApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/youtube")
public class YoutubeSearchController {

    @Autowired
    YoutubeSearchApiService youtubeSearchApiService;

    @GetMapping("search")
    public ResponseObj getVideoData(@RequestParam("query") String query){
        YoutubeSearchResultDto youtubeSearchResultDTO = youtubeSearchApiService.getSearchResult(query);
        return new ResponseObj(true, youtubeSearchResultDTO);
    }
}
