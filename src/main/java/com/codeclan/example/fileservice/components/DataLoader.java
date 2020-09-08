package com.codeclan.example.fileservice.components;

import com.codeclan.example.fileservice.models.File;
import com.codeclan.example.fileservice.models.Folder;
import com.codeclan.example.fileservice.models.User;
import com.codeclan.example.fileservice.repositories.FileRepository;
import com.codeclan.example.fileservice.repositories.FolderRepository;
import com.codeclan.example.fileservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader() {}


    @Override
    public void run(ApplicationArguments args) throws Exception {

        Folder pictures = new Folder("Pictures");
        folderRepository.save(pictures);
        File holidayPicture = new File("turkey", ".jpg", 12.00, pictures);
        fileRepository.save(holidayPicture);
        User james = new User("James");
        userRepository.save(james);

    }
}
