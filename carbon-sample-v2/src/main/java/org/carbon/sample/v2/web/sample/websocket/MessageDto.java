package org.carbon.sample.v2.web.sample.websocket;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Shota Oda 2017/02/12.
 */
@Getter
@AllArgsConstructor
public class MessageDto {
    private String sender;
    private String content;
}
