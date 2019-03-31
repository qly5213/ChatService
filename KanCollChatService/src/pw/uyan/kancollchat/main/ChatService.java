package pw.uyan.kancollchat.main;

import java.net.InetSocketAddress;

public class ChatService {

	public static void main(String[] args) {
		new ServerBootStrap().start(new InetSocketAddress(NettyConfig.WS_HOST, NettyConfig.WS_PORT));
	}
}
