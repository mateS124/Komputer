package pl.komputer.drive;

import pl.komputer.file.File;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class HDDDrive implements Drive {
   private final List<File> files = new ArrayList<>();
    @Override
    public void addFile(File file) {
        files.add(file);
    }

    @Override
    public void listFile() {
//      files.forEach(System.out::println);

      for (File file: files){
          System.out.println(file.getName());
      }
    }

    @Override
    public File findFile(String name) throws Throwable {
        Optional<File> foundFile = files.stream()
                .filter(file -> file.getName().equals(name))
                .findFirst();
         return foundFile.orElseThrow((Supplier<Throwable>) () -> null);
    }

}
