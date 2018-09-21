package hello;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class FileLoadController {

    @MessageMapping("/filePath")
    @SendTo("/topic/greetings")

    public String string(){
        return "hello";
    }

}
