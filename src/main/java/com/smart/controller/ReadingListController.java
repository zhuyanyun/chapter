package com.smart.controller;

import com.smart.entity.Book;
import com.smart.service.ReadingListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by zyy on 19/9/9.
 */

@Controller
@RequestMapping("/read")
public class ReadingListController {

    @Autowired
    private ReadingListRepository readingListRepository;

    @RequestMapping(value = "/{reader}",method = RequestMethod.GET)
    public String readersBooks(@PathVariable("reader") String reader, Model model){
        List<Book> readerList = readingListRepository.findByReader(reader);
        if(CollectionUtils.isEmpty(readerList)){
            model.addAttribute("books",readerList);
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
