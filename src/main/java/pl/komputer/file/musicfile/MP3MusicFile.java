package pl.komputer.file.musicfile;

import lombok.ToString;

@ToString
public class MP3MusicFile extends AbstractMusicFile{
   private int quality;


    public MP3MusicFile(String name, int size, String bandName, String title, int quality) {
        super(name, size, bandName, title);

        this.quality = quality;
    }

    @Override
    public String getName() {
        return "Plik nazywa się: " + super.getName();
    }

    @Override
    public void play() {
        System.out.println("Playing MP3 file");
    }

    public int getQuality() {
        return quality;
    }


}
