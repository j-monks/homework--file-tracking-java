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

        User colin = new User("Colin");
        userRepository.save(colin);

        User hannah = new User("Hannah");
        userRepository.save(hannah);

        User eugene = new User("Eugene");
        userRepository.save(eugene);

        Folder folder1 = new Folder("Colin's Documents", colin);
        folderRepository.save(folder1);

        Folder folder2 = new Folder("Hannah's Spreadsheets", hannah);
        folderRepository.save(folder2);

        Folder folder3 = new Folder("Eugene's Pictures", eugene);
        folderRepository.save(folder3);

        Folder folder4 = new Folder("Memes", eugene);
        folderRepository.save(folder4);

        File file1 = new File("To-Do List", ".txt", 100, folder1);
        fileRepository.save(file1);

        File file2 = new File("Class Notes", ".docx", 12345, folder1);
        fileRepository.save(file2);

        File file3 = new File("Expenses", ".xls", 5, folder2);
        fileRepository.save(file3);

        File file4 = new File("Attendance Record", ".csv", 98724, folder2);
        fileRepository.save(file4);

        File file5 = new File("Portrait", ".png", 100000000, folder3);
        fileRepository.save(file5);

        File file6 = new File("Landscape", ".jpeg", 127486, folder3);
        fileRepository.save(file6);

        File file7 = new File("Cat Falling Over", ".gif", 99999999, folder4);
        fileRepository.save(file7);

    }
}
