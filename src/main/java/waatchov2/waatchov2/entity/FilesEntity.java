package waatchov2.waatchov2.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name="files")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FilesEntity {

    @Id
    @GeneratedValue
    private int file_id;
    private String file_url;
    private String file_name;
    private String file_type;
    private LocalDateTime file_date_time;
    private String file_size;
    private String uploaded_by_id;
}
