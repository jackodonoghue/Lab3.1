import javax.swing.*;

public class FilmDriver {
    private static Film film = new Film();
    private static Film[] myFlix;

    public static void main(String[] args) {


        String title, director;
        int duration, place = 0, n = Integer.parseInt(JOptionPane.showInputDialog("How many films would you like to add?"));

        myFlix = new Film[n];

        for(int i = 0; i < n; i++){

            title = JOptionPane.showInputDialog("Enter title: ");
            director = JOptionPane.showInputDialog("Enter director: ");
            duration = Integer.parseInt(JOptionPane.showInputDialog("Enter duration: "));
            film = new Film(title, director, duration);

            place = Integer.parseInt(JOptionPane.showInputDialog("Which position would you like to place this movie?")) - 1;

            myFlix[place] = film;
        }


        displayFilms();
    }

    public static void displayFilms() {
        JTextArea textArea = new JTextArea(10,20);

        textArea.setText("Number of movies: " + film.getCount() + "\n\n");

        for(int i = 0; i < myFlix.length; i++) {
            textArea.append(myFlix[i].toString() + "\n\n");
        }

        JOptionPane.showMessageDialog(null, textArea);

    }
}
