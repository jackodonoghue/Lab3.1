public class Film {
    private String title;
    private String director;
    private int duration;
    private static int count = -1;//add class variable count

    //Constructors
    public Film() {
        this("No title specified", "No director specified", 0);
    }

    public Film(String t, String d, int l) {
        this.title = t;
        this.director = d;
        this.duration = l;
        count++;//counts each time a new object is created
    }

    //Mutator
    public void setTitle() {
        this.title = title;
    }

    public void setDirector() {
        this.director = director;
    }

    public void setDuration() {
        this.duration = duration;
    }

    //Accessor

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getDuration() {
        return duration;
    }

    //Counter Accessor
    public int getCount() {
        return count;
    }

    //Convert to String

    @Override
    public String toString() {
        return String.format("Title: %-20s \nDirector: %-20s \nDuration %-20d",title, director, duration);
    }
}
