package her.fer.iot.projektbackend.controller;

import her.fer.iot.projektbackend.dto.DataDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketController {

    private static SimpMessagingTemplate template;

    @Autowired
    public WebSocketController(SimpMessagingTemplate template) {
        WebSocketController.template = template;
    }

    public static void broadcast(DataDto dataDto) {
        template.convertAndSend("/topic/data", dataDto);
    }
}