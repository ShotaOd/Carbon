package org.carbon.sample.heroku.web.sample.websocket;

import org.carbon.web.annotation.Channeled;
import org.carbon.web.annotation.OnClose;
import org.carbon.web.annotation.OnOpen;
import org.carbon.web.annotation.OnReceive;
import org.carbon.web.annotation.PathVariable;
import org.carbon.web.annotation.Socket;
import org.carbon.web.ws.ChannelConfiguration;
import org.carbon.web.ws.Message;

/**
 * @author Shota Oda 2017/02/12.
 */
@Socket(url = "/message/socket/{userName}/{roomId}")
public class ChatSocket {

    @OnOpen
    public void onConnect() {
        // do something ...
    }

    @OnClose
    public void onClose() {
        // do something ...
    }

    @OnReceive
    public MessageDto onReceive(@PathVariable("roomId") String roomId, Message message) {
        return new MessageDto(message.getFrom().getKey(), message.getContent());
    }

    @Channeled
    public ChannelConfiguration config(@PathVariable("userName") String userName,
                                       @PathVariable("roomId") String roomId) {
        return ChannelConfiguration.simple(roomId, userName);
    }
}
