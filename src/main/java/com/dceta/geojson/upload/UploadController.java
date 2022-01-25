package com.dceta.geojson.upload;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class UploadController {

    @PostMapping("/upload")
    public void uploadGeoJSON(@RequestParam("file") MultipartFile file,
                              RedirectAttributes redirectAttributes) {

    }

}
