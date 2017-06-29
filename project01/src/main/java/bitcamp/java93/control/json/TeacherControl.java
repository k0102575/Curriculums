package bitcamp.java93.control.json;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import bitcamp.java93.domain.Teacher;
import bitcamp.java93.service.TeacherService;

@RestController
@RequestMapping("/teacher/")
public class TeacherControl {
  
  @Autowired ServletContext servletContext;
  @Autowired
  TeacherService teacherService;

  @RequestMapping("list")
  public JsonResult list(
      @RequestParam(defaultValue="1") int pageNo, @RequestParam(defaultValue="100") int pageSize) throws Exception {
    
    HashMap<String,Object> dataMap = new HashMap<>();
    dataMap.put("list", teacherService.list(pageNo, pageSize));
    dataMap.put("totalCount", teacherService.getSize());

    return new JsonResult(JsonResult.SUCCESS, dataMap);

  } // list()
  
  @RequestMapping("detail")
  public JsonResult detail(int no) throws Exception {

    Teacher teacher = teacherService.get(no);

    if (teacher == null) {
      return new JsonResult(JsonResult.FAIL, "fail");
    }

    return new JsonResult(JsonResult.SUCCESS, teacher);

  } // detail()
  
  @RequestMapping("update")
  public JsonResult update(Teacher teacher/*, MultipartFile[] photo*/) throws Exception {

//    teacher.setPhotoList(processMultipartFiles(photo));

    teacherService.update(teacher);

    return new JsonResult(JsonResult.SUCCESS, "ok");

  } // update()
  
  @RequestMapping("delete")
  public JsonResult delete(int no) throws Exception {

    teacherService.remove(no);

    return new JsonResult(JsonResult.SUCCESS, "ok");
  } // delete()
  
  @RequestMapping("add")
  public JsonResult add(Teacher teacher/*, MultipartFile[] photo*/) throws Exception {

//    teacher.setPhotoList(processMultipartFiles(photo));
    teacherService.add(teacher);
    return new JsonResult(JsonResult.SUCCESS, "ok");
  } // add()
  
  
  int count = 0;
  synchronized private String getNewFilename() {
    if (count > 100) {
      count = 0;
    }
    
    return String.format("%d_%d", System.currentTimeMillis(), ++count); 
  } // getNewFilename()
  
  private List<String> processMultipartFiles(MultipartFile[] files) throws Exception {
    ArrayList<String> photoList = new ArrayList<>();
    for (MultipartFile file : files) {
      if (file.isEmpty()) 
        continue;
      String filename = getNewFilename();
      file.transferTo(new File(servletContext.getRealPath("/teacher/photo/" + filename)));
      
      photoList.add(filename);
    }
    return photoList;
  } // processMultipartFiles
  
}
