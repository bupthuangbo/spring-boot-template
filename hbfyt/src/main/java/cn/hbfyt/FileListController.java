package cn.hbfyt;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/display")
public class FileListController {
    @RequestMapping("/getFileList.do")
    @ResponseBody
    protected ArrayList<String> CalculateGeoServlet(HttpServletRequest req, HttpServletResponse resp, String params)
            throws ServletException, IOException, MalformedURLException {
        ArrayList<String> fileList = new ArrayList<String>();
        fileList = getFiles("src/main/webapp/upload/imgs/");
        return fileList;
    }

    public static ArrayList<String> getFiles(String filePath) {
        ArrayList<String> fileList = new ArrayList<String>();
        File root = new File(filePath);
        File[] files = root.listFiles();
        for (File file : files) {
            String picPathStr = file.getName();
            fileList.add(picPathStr);
        }
        return fileList;
    }
}