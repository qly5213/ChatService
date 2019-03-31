package pw.uyan.kancollchat.main;

public class WsMessage {

    private int msgType;
    private String userName;
    private String msg;

    @Override
    public String toString() {
        return "WsMessage{" +
                "t=" + msgType +
                ", n='" + userName + '\'' +
                ", body='" + msg + '\'' +
                '}';
    }

    public WsMessage(int msgType, String userName, String msg) {
        this.msgType = msgType;
        this.userName = userName;
        this.msg = msg;
    }

	public int getMsgType() {
		return msgType;
	}

	public void setMsgType(int msgType) {
		this.msgType = msgType;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
