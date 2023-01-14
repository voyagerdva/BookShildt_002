package e0062_Threads_wait_notify_2;

public class Message {

    private String msg;

    private Message(String str) {
        this.msg = str;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
