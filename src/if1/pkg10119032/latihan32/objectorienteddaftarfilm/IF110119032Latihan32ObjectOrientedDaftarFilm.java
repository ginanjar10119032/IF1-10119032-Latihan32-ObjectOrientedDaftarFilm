package if1.pkg10119032.latihan32.objectorienteddaftarfilm;

/**
 *
 * @author Ginanjar Tubagus Gumilar
 * Nama     : Ginanjar Tubagus Gumilar
 * Kelas    : IF 1
 * NIM      : 10119032
 * Deskripsi Program : Berisi program untuk menampilkan
 * daftar film beserta rinciannya ke layar.
 */
public class IF110119032Latihan32ObjectOrientedDaftarFilm {

    static class Film{
        String filmName;
        String filmGenre;
        double filmRating;
        int filmDuration;
        
        public void nowPlaying(){
            System.out.println("Judul Film : " + filmName + "\n"
                    + "Genre Film : " + filmGenre + "\n"
                    + "Rating Film : " + filmRating + "\n"
                    + "Duration Film : " + filmDuration + " Menit\n");
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== Daftar Film Sedang Tayang =====\n");
        //membuat objek dari kelas Film
        Film f = new Film();
        
        //rincian dari film pertama
        f.filmName = "Venom";
        f.filmGenre = "Action, Horror, Scifi";
        f.filmRating = 8.5;
        f.filmDuration = 120;
        f.nowPlaying();
        
        //rincian dari film kedua
        f.filmName = "Small Foot";
        f.filmGenre = "Animation";
        f.filmRating = 9.0;
        f.filmDuration = 96; 
        f.nowPlaying();
        
        //rincian dari film ketiga
        f.filmName = "Crazy Rich Asian";
        f.filmGenre = "Comedy";
        f.filmRating = 7.8;
        f.filmDuration = 119;  
        f.nowPlaying();
        
        //rincian dari film keempat
        f.filmName = "Asih";
        f.filmGenre = "Horror";
        f.filmRating = 6.0;
        f.filmDuration = 100;  
        f.nowPlaying();
    }
    
}
