/*
CSC 307 - Lab 4
Name: Luis Magana
Partner: Logan Schwarz
*/

public class Classroom {

    public static void main(String[] args) {
        Board board = new Board();
        Professor p = new Professor();

        Student[] students = new Student[6];
        for(int i = 0; i < 6; i++){
            students[i] = new Student();
            board.addObserver(students[i]);
        }

        p.setInfo("Hello");
        p.write(board);

        p.setInfo("Bye");
        p.write(board);

    }
}
