import javelin.Javelin;

public class Main {
    public static void main(String[] args) {

        Javelin app = Javelin.create();

        // Serve static files from the "public" directory
        app.use(new StaticFileHandler("public"));

        app.post("/radio", (req, res) -> {
            String selectedStudent = req.formParam("student");
            String message = "";

            if (selectedStudent.equals("student1")) {
                message = "Information for Student 1";
            } else if (selectedStudent.equals("student2")) {
                message = "Information for Student 2";
            }

            res.html("<h1>" + message + "</h1>");
        });

        app.start(7000);
    }
}
