import java.util.ArrayList;
public class Playlist {

    public static void main(String[] args){

        ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
        desertIslandPlaylist.add(0, "Take me home tonight");
        desertIslandPlaylist.add(1, "Folsom Prison");
        desertIslandPlaylist.add(2, "Say it aint so");
        desertIslandPlaylist.add(3, "Dark Side of the Moon");
        desertIslandPlaylist.add(4, "Cry me a river");
        desertIslandPlaylist.add(5, "Zombie Nation");

        System.out.println(desertIslandPlaylist);
        int indexA = desertIslandPlaylist.indexOf("Take me home tonight");
        int indexB = desertIslandPlaylist.indexOf("Zombie Nation");

        String tempA = "Take me home tonight";

        desertIslandPlaylist.set(indexA, "Zombie Nation");
        // System.out.println(desertIslandPlaylist);
        desertIslandPlaylist.set(indexB, tempA);
        System.out.println(desertIslandPlaylist);

    }

}
