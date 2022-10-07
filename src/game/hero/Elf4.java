package game.hero;

public class Elf4 {
    private int id;
    private String nickName;

    public int getId() {
        return id;
    }

    public String getNickName() {
        return nickName;
    }

    public Elf4() {
    }

    public Elf4(int id) {
        this.id = id;
    }

    public Elf4(String nickName) {
        this.nickName = nickName;
    }

    public Elf4(int id, String nickName) {
        this.id = id;
        this.nickName = nickName;
    }
public int getid(){
        return id;
}

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setId(int id) {
        this.id = id;
    }
}