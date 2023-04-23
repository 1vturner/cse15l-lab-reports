import java.io.IOException;
import java.net.URI;

class Handler implements URLHandler {
    // The one bit of state on the server: a number that will be manipulated by
    // various requests.
    String x = " ";

    public String handleRequest(URI url) {
        if (url.getPath().equals("/add-message?s=")) {
            return this.x + "/n";
        } else {
            return "";
        }
    }
}

class NumberServer {
    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.out.println("Missing reference");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(this.x, o, new Handler());
    }
}
