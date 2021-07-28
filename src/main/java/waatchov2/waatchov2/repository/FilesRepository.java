package waatchov2.waatchov2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import waatchov2.waatchov2.entity.FilesEntity;

import java.util.List;

public interface FilesRepository extends JpaRepository<FilesEntity, Integer> {

    @Query(value = "select file_url from files", nativeQuery = true)
    List<String> ListURL();
}