package uz.pdp.market.telegram.telegramService;


import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import uz.pdp.market.entity.auth.AuthUser;
import uz.pdp.market.repository.AuthUserRepository;
import uz.pdp.market.telegram.BotProcess;

import java.util.List;


@Service
@RequiredArgsConstructor
public class TelegramService {

    private final BotProcess BOT;
    private final AuthUserRepository userRepository;


    public void getPhone(String chatId) {

    }

    public void changeStatus(String chatId, String state) {
        userRepository.changeStatus(chatId, state);
    }

    public void getFullName(String chatId) {

    }

    public void getPassword(String chatId) {

    }

//    @Scheduled(cron = "0 39 17 * * MON-FRI")
//    public void schedule() {
//        List<AuthUser> users = userRepository.findAll();
//        for (AuthUser user : users) {
//            String chatId = user.getChatId();
////            if (user.getRole().equals(Role.USER.name()))
////                this.ordering(chatId);
//        }
//    }

    public void sayHi(Message message){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setText(message.getText());

        BOT.executeMessage(sendMessage);
    }






}
