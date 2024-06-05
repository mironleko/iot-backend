package her.fer.iot.projektbackend.controller;

import her.fer.iot.projektbackend.dto.DataDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/data")
public class DataController {

    @PostMapping
    public ResponseEntity<Void> receiveData(@RequestBody DataDto dataDto) {
        System.out.println("Received data: " + dataDto);

        WebSocketController.broadcast(dataDto);

        return ResponseEntity.ok().build();
    }
}