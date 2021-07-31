package waatchov2.waatchov2.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import waatchov2.waatchov2.entity.FilesEntity;
import waatchov2.waatchov2.repository.FilesRepository;

import java.util.List;

@Service
public class FilesService {

    @Autowired
    private FilesRepository repository;

    public FilesEntity addVideo(FilesEntity fileDetails){
        return repository.save(fileDetails);
    }

    public List<String> ListURL(){
        return repository.ListURL();
    }

    public List<FilesEntity> getAllVideoList(){
        return repository.findAll();
    }
}
