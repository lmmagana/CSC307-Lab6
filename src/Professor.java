public class Professor {

    private String info;

    public String getInfo() {
        return info;
    }

    public void setInfo(String s){
        info = s;
    }

    public void write(Board board){

        board.add(info);
    }
}
