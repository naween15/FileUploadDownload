package com.example.fileuploaddowanload.Helper;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

@Component
public class FileUploadHelper {

    public String addFile(MultipartFile file){
        final String uplaodDirectry="C:\\Users\\serve nepal\\FileUploadDowanload\\src\\main\\resources\\static\\images";

        try {Files.copy(file.getInputStream(), Paths.get(uplaodDirectry+ File.separator+file.getOriginalFilename()));
        }catch (Exception e){
            e.printStackTrace();
        }
        return "ok";
    }
}
