package cn.hbfyt;

import java.io.File;
import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DisplayController {
    private static final Logger LOGGER = LoggerFactory.getLogger(DisplayController.class);

    @RequestMapping(value = "/pic", method = RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView view = new ModelAndView();
        view.setViewName("pic");
        ArrayList<String> fileList = new ArrayList<String>();
        fileList = getFiles();
        view.addObject("src", fileList);
        view.addObject("num", fileList.size());
        LOGGER.info("pic num is " + fileList.size());
        return view;
    }

    public static ArrayList<String> getFiles() {
        String filePath = "src/main/webapp/upload/imgs/";
        ArrayList<String> fileList = new ArrayList<String>();
        File root = new File(filePath);
        File[] files = root.listFiles();
        if (files == null || files.length == 0) {
            return fileList;
        }
        for (File file : files) {
            String picPathStr = "/upload/imgs/" + file.getName();
            System.out.println(picPathStr);
            fileList.add(picPathStr);
        }
        return fileList;
    }

    public static int getNum() {
        String filePath = "src/main/webapp/upload/imgs/";
        ArrayList<String> fileList = new ArrayList<String>();
        File root = new File(filePath);
        File[] files = root.listFiles();
        return files.length;
    }
}