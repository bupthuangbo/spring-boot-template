package cn.hbfyt;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

@RestController
@RequestMapping("/upload")
public class UploadController {
    private static final Logger LOGGER = LoggerFactory.getLogger(UploadController.class);

    @RequestMapping(value = "/image", method = RequestMethod.POST)
    public void doUploadFile(@RequestParam("file") MultipartFile file) {
        if (!file.isEmpty()) {
            try {

                // 这里将上传得到的文件保存至 d:\\temp\\file 目录
                FileUtils.copyInputStreamToFile(file.getInputStream(), new File(
                        "src/main/webapp/upload/imgs/" + file.getOriginalFilename()));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
    /**
     * 调整upload.html的格式
     */
    public void doChange() {
        ArrayList<String> fileList = new ArrayList<String>();
        fileList = FileListController.getFiles("src/main/webapp/upload/imgs/");
        
    }
}