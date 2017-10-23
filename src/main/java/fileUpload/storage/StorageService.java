package fileUpload.storage;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;
import java.util.stream.Stream;

public interface StorageService {
	
    Stream<Path> loadAll();

    Path load(String filename);

	Resource loadAsResource(String filename);

	void deleteAll();

    void init();

    void store(MultipartFile file);

    void store(String metaData);

 


}
