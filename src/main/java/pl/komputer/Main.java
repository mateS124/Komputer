package pl.komputer;

import pl.komputer.drive.Drive;
import pl.komputer.drive.HDDDrive;
import pl.komputer.file.imagefile.GIFImageFile;
import pl.komputer.file.imagefile.JPGImageFile;
import pl.komputer.file.musicfile.MP3MusicFile;

public class Main {
    public static void main(String[] args) {
//        Monitor monitor = new Monitor();
//        HDDDrive drive = new HDDDrive();
//        SSDDrive drive = new SSDDrive();
//
//
//        Computer computer = new Computer(monitor,drive );

//        drive.addFile(new File("jnsp.jpg"));
//        drive.listFile();

//        MemoryStick memoryStick = new MemoryStick("Pendrive");
//        Mouse mouse = new Mouse("Mouse");
//
//        computer.addUsbDevices(mouse);
//        computer.addUsbDevices(memoryStick);
//
//        memoryStick.eject();
//        computer.removeUsbDevice(mouse);
//        computer.removeUsbDevice(memoryStick);

        GIFImageFile gif1 = new GIFImageFile("nazwa_1.gif", 100);
        JPGImageFile jpg1 = new JPGImageFile("nazwa_1.jpg", 200, 382);

        MP3MusicFile mp3File = new MP3MusicFile("plik.mp3", 4000, "Marlyn Manson", "Broken", 384);

        Drive drive = new HDDDrive();
        drive.addFile( gif1);
        drive.addFile( jpg1);
        drive.addFile(mp3File );
//
//        drive.listFile();
//        File file = drive.findFile("plik.mp3");
//        System.out.println(file.getSize());
//
       System.out.println(mp3File);

        GIFImageFile gifImageFile = new GIFImageFile("plik1.gif", 3500);
        System.out.println(gifImageFile);



    }
}