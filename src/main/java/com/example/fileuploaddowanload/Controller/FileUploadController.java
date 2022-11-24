package com.example.fileuploaddowanload.Controller;

import com.example.fileuploaddowanload.Helper.FileUploadHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class FileUploadController {
    @Autowired
    private FileUploadHelper helper;

    @PostMapping("/upload")
    public String uplaodFile(@RequestParam("file")MultipartFile file){
        helper.addFile(file);
        return "ok";
    }
}
