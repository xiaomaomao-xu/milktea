package com.hsys.tea.milktea.socket;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


public class MyWebSocketHandler implements WebSocketHandler{
	private static ConcurrentHashMap<String, WebSocketSession> webSocketSet = new ConcurrentHashMap<String, WebSocketSession>();//用户
	private static ConcurrentLinkedQueue<WebSocketSession> webSocketSetcat = new ConcurrentLinkedQueue<WebSocketSession>();//用户
	private static ConcurrentHashMap<String, WebSocketSession> webSocketSetjiu = new ConcurrentHashMap<String, WebSocketSession>();//用户
    // 连接 就绪时 
    @Override
    public void afterConnectionEstablished(WebSocketSession session)
            throws Exception {
    	String userId = (String) session.getHandshakeAttributes().get("user");
//    	System.out.println(userId);
    	if(userId.split(",")[0].equals("c")){
    		webSocketSetcat.add(session);
    	}else if(userId.split(",")[0].equals("s")) {
    		webSocketSetjiu.put(userId, session);
    	}else {
    		webSocketSet.put(userId,session);
    	}
    }
    // 处理信息
    @Override
    public void handleMessage(WebSocketSession session,
         WebSocketMessage<?> message) throws Exception {
    	 Gson gson = new Gson();
    	 Map<String, Object> msg = gson.fromJson(message.getPayload().toString(),new TypeToken<Map<String, Object>>() {}.getType());
//    	 System.out.println("后台："+msg.get("msgContent").toString());
    	 if(msg.get("msgContent").toString().split(",")[0].equals("c")) {
    		 sendMsgToAllUsers(message);
    	 }else if(msg.get("msgContent").toString().split(",")[0].equals("s")) {
    		 try {
				WebSocketSession gsp = webSocketSetjiu.get(msg.get("gspId").toString());
				gsp.sendMessage(message);
			} catch (Exception e) {
			}
    	 }
    }


    // 处理传输时异常
    @Override
    public void handleTransportError(WebSocketSession session,
            Throwable exception) throws Exception {
        // TODO Auto-generated method stub

    }



    // 关闭 连接时
    @Override
    public void afterConnectionClosed(WebSocketSession session,
            CloseStatus closeStatus) throws Exception {

    	String userId = (String) session.getHandshakeAttributes().get("user");
    	webSocketSet.remove(userId);

    }



    @Override
    public boolean supportsPartialMessages() {
        // TODO Auto-generated method stub
        return false;
    }



    // 给所有用户发送 信息
    public void sendMsgToAllUsers(WebSocketMessage<?> message) throws Exception{

        for(WebSocketSession car:webSocketSetcat) {
        	car.sendMessage(message);
        }
    }

}
