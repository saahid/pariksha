package org.codekitchen.pariksha.caching.filecache.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
@Slf4j
public class FileController {

    private final Path uploadDir = Paths.get("d:\\uploads");

    @RequestMapping(value = "/upload", method = RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<Object> uploadImage(@RequestParam("file") MultipartFile file) throws IOException {
        store(file);
        return new ResponseEntity<>("Ok", HttpStatus.OK);
    }

    private void store(MultipartFile uploadFile) {
        try {
            Files.copy(uploadFile.getInputStream(), this.uploadDir.resolve(uploadFile.getOriginalFilename()));
        } catch (Exception e) {
            throw new RuntimeException("Could not store the file. Error: " + e.getMessage());
        }
    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<?> handleStorageFileNotFound(RuntimeException cause) {
        return ResponseEntity.notFound().build();
    }

}
