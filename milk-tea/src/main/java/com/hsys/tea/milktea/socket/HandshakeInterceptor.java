package com.hsys.tea.milktea.socket;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.support.HttpSessionHandshakeInterceptor;

public class HandshakeInterceptor extends HttpSessionHandshakeInterceptor{


    // 握手前
    @Override
    public boolean beforeHandshake(ServerHttpRequest request,
            ServerHttpResponse response, WebSocketHandler wsHandler,
            Map<String, Object> attributes) throws Exception {
    	HttpServletRequest servletRequest = ((ServletServerHttpRequest) request).getServletRequest();
        String type = servletRequest.getParameter("user");
        attributes.put("user", type);
        return super.beforeHandshake(request, response, wsHandler, attributes);
    }



    // 握手后
    @Override
    public void afterHandshake(ServerHttpRequest request,
            ServerHttpResponse response, WebSocketHandler wsHandler,
            Exception ex) {
        super.afterHandshake(request, response, wsHandler, ex);
    }

}
