package Classes;
public class TvShow {

    String nameOfTheShow;
    int numberOfEpisodes;
    String genre;

    public String getNameOfTheShow() {
        return nameOfTheShow;
    }

    public int getNumberOfEpisodes() {
        return numberOfEpisodes;
    }

    public String getGenre() {
        return genre;
    }

    public TvShow (String nameOfTheShow){
        this.nameOfTheShow = nameOfTheShow;
    }

    public TvShow (String nameOfTheShow, int numberOfEpisodes){
        this.nameOfTheShow = nameOfTheShow;
        this.numberOfEpisodes = numberOfEpisodes;
    }

    public TvShow (String nameOfTheShow, int numberOfEpisodes, String genre){
        this.nameOfTheShow = nameOfTheShow;
        this.numberOfEpisodes = numberOfEpisodes;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "The name of the show is "
                + getNameOfTheShow() + " with "
                + getNumberOfEpisodes() + " of episodes. The genre is "
                + getGenre();
    }
}
