package com.smart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.smart.entity.Book;
import com.smart.service.ReadingListRepository;

/**
 * Created by zyy on 19/9/9.
 */

@Controller
@RequestMapping("/")
@ConfigurationProperties(prefix = "amazon")
public class ReadingListController {

    private String associatedId;

    @Autowired
    private ReadingListRepository readingListRepository;

    public void setAssociatedId(String associatedId) {
        this.associatedId = associatedId;
    }

    @RequestMapping(value = "/{reader}",method = RequestMethod.GET)
    public String readersBooks(@PathVariable("reader") String reader, Model model){
        List<Book> readerList = readingListRepository.findByReader(reader);
        if(CollectionUtils.isEmpty(readerList)){
            model.addAttribute("books",readerList);
            model.addAttribute("reader",reader);
            model.addAttribute("amazonID", associatedId);
        }
        return "readingList";
    }

    @RequestMapping(value="/{reader}",method = RequestMethod.POST)
    public String addToReadingList(@PathVariable("reader")String reader,Book book){
        book.setReader(reader);
        readingListRepository.save(book);
        return "redirect:/{reader}";
    }
}
