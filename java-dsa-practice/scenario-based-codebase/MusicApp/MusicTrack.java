package MusicApp;



public class MusicTrack {

    private TrackNode root;

    // Insert track
    public void insert(int id, String name, String artist) {
        root = insertRec(root, id, name, artist);
    }

    private TrackNode insertRec(TrackNode root, int id, String name, String artist) {

        if (root == null) {
            return new TrackNode(id, name, artist);
        }

        if (id < root.id) {
            root.left = insertRec(root.left, id, name, artist);
        } else if (id > root.id) {
            root.right = insertRec(root.right, id, name, artist);
        }

        return root;
    }


    public void search(int id) {
        searchRec(root, id);
    }

    private void searchRec(TrackNode root, int id) {

        if (root == null) {
            System.out.println("No Track Found");
            return;
        }

        if (root.id == id) {
            System.out.println("Track Found:");
            System.out.println("ID: " + root.id);
            System.out.println("Name: " + root.name);
            System.out.println("Artist: " + root.artist);
            return;
        }

        if (id < root.id) {
            searchRec(root.left, id);
        } else {
            searchRec(root.right, id);
        }
    }


    public void show() {
        showRec(root);
    }

    private void showRec(TrackNode root) {

        if (root != null) {
            showRec(root.left);
            System.out.println(
                "Track ID: " + root.id +
                " | Name: " + root.name +
                " | Artist: " + root.artist
            );
            showRec(root.right);
        }
    }
}

