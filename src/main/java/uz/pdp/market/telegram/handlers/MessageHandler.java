package uz.pdp.market.telegram.handlers;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import uz.pdp.market.dto.auth.AuthUserDto;
import uz.pdp.market.enums.State;
import uz.pdp.market.service.auth.AuthUserService;
import uz.pdp.market.telegram.BotProcess;
import uz.pdp.market.telegram.buttons.MarkupBoards;
import uz.pdp.market.telegram.telegramService.RegisterService;
import uz.pdp.market.telegram.telegramService.TelegramService;

import java.util.Objects;


@Component
@RequiredArgsConstructor
public class MessageHandler {

    private final TelegramService service;
    private final RegisterService registerService;
    private final AuthUserService userService;
    private final BotProcess BOT;


    public void handle(Message message) {
        String chatId = message.getChatId().toString();
        AuthUserDto user = userService.getByChatId(chatId);
        String text = message.getText();

        service.sayHi(message);

        if (Objects.isNull(text)) {
            message.setText("ok");
        }
        if (Objects.nonNull(user)) {
            BOT.userState.put(chatId,State.START.getName());
        }
        if (message.hasContact() || (message.getText().equals("/start") &&
                Objects.isNull(user)) ||
                !BOT.userState.get(chatId).equals(State.START.getName())) {
            registerService.register(message);
        }


    }
}
