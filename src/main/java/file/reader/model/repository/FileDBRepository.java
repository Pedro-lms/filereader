package file.reader.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import file.reader.model.FileDB;

public interface FileDBRepository extends JpaRepository<FileDB, String>{

}
