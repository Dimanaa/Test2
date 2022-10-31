public class Discs  extends Objects implements Items{
    public String artist;
    public String title;
    private float duration;
    private int numOfTracks;

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void DownloadFile() {

    }
}
