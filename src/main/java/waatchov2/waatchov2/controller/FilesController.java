package waatchov2.waatchov2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import waatchov2.waatchov2.entity.FilesEntity;
import waatchov2.waatchov2.service.FilesService;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000/")
public class FilesController {

    @Autowired
    private FilesService service;

    @PostMapping("/addVideo")
    public FilesEntity addVideo(@RequestBody FilesEntity fileDetails){
        return service.addVideo(fileDetails);
    }

    @GetMapping("/ListURL")
    public List<String> ListURL(){
        return service.ListURL();
    }
}