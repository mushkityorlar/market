package uz.pdp.market.telegram.handlers;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.Message;
import uz.pdp.market.dto.auth.AuthUserDto;
import uz.pdp.market.service.auth.AuthUserService;
import uz.pdp.market.telegram.BotProcess;
import uz.pdp.market.telegram.telegramService.TelegramService;

@Component
@RequiredArgsConstructor
public class CallbackHandler {

    private final AuthUserService userService;




    public void handle(CallbackQuery callbackQuery) {
        Message message = callbackQuery.getMessage();
        String data = callbackQuery.getData();
        String chatID = message.getChatId().toString();
        AuthUserDto user = userService.getByChatId(chatID);



    }

}
