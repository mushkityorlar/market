package uz.pdp.market.telegram.telegramService;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.DeleteMessage;
import org.telegram.telegrambots.meta.api.objects.Contact;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ForceReplyKeyboard;
import uz.pdp.market.dto.auth.AuthUserCreateDto;
import uz.pdp.market.enums.State;
import uz.pdp.market.telegram.BotProcess;
import uz.pdp.market.telegram.buttons.InlineBoards;
import uz.pdp.market.telegram.buttons.MarkupBoards;

import java.util.Objects;


@Service
@RequiredArgsConstructor
public class RegisterService {

    private final BotProcess BOT;
    private final PasswordEncoder encoder;


    public void register(Message message) {
        String chatID = message.getChatId().toString();
        String state = BOT.userState.get(chatID);
        if (Objects.isNull(BOT.userHashMap.get(chatID))) {
            BOT.userHashMap.put(chatID, new AuthUserCreateDto());
        }


        if (Objects.isNull(state)) {
            SendMessage sendMessage = new SendMessage(chatID, "Ismingizni kiriting:");
            sendMessage.setReplyMarkup(new ForceReplyKeyboard());
            BOT.executeMessage(sendMessage);
            BOT.userState.put(chatID, State.USER_NAME.getName());

        } else if (State.USER_NAME.getName().equals(state)) {
            String fullName = message.getText();

            AuthUserCreateDto userCreateDto = BOT.userHashMap.get(chatID);
            userCreateDto.setFullName(fullName);
            BOT.userHashMap.put(chatID, userCreateDto);

            SendMessage sendMessage = new SendMessage(chatID, "Foydalanuvchi nomimi kiriting:");
            sendMessage.setReplyMarkup(new ForceReplyKeyboard());
            BOT.executeMessage(sendMessage);
            BOT.userState.put(chatID, State.PASSWORD.getName());
        } else if (State.PASSWORD.getName().equals(state)) {
            String username = message.getText();

            AuthUserCreateDto userCreateDto = BOT.userHashMap.get(chatID);
            userCreateDto.setUserName(username);
            BOT.userHashMap.put(chatID, userCreateDto);

            SendMessage sendMessage = new SendMessage(chatID, "Parol kiriting:");
            Integer id = sendMessage.getReplyToMessageId();
            sendMessage.setReplyMarkup(new ForceReplyKeyboard());
            BOT.executeMessage(sendMessage);
            BOT.userState.put(chatID, State.PHONE_NUMBER.getName());
        } else if (State.PHONE_NUMBER.getName().equals(state)) {
            String password = message.getText();
            AuthUserCreateDto userCreateDto = BOT.userHashMap.get(chatID);
            userCreateDto.setPassword(encoder.encode(password));
            BOT.userHashMap.put(chatID, userCreateDto);
            SendMessage delete = new SendMessage(chatID, "Parol tog'ri kiritildimi?");
            BOT.executeMessage(delete);
            DeleteMessage deleteMessage = new DeleteMessage(chatID, message.getMessageId());
            BOT.executeMessage(deleteMessage);
            SendMessage phoneMessage = new SendMessage();
            phoneMessage.setReplyMarkup(MarkupBoards.sharePhoneNumber());
            phoneMessage.setText("Telefon raqamingizni kiriting:");
            phoneMessage.setChatId(chatID);
            BOT.executeMessage(phoneMessage);
            BOT.userState.put(chatID, State.MARKET.getName());
        } else if (BOT.userState.get(chatID).equals(State.MARKET.getName())) {
            if (message.hasContact()) {
                Contact contact = message.getContact();
                AuthUserCreateDto userCreateDto = BOT.userHashMap.get(chatID);
                userCreateDto.setPhone(contact.getPhoneNumber());
                userCreateDto.setChatId(chatID);
                BOT.userHashMap.put(chatID, userCreateDto);

                SendMessage message1 = new SendMessage(chatID, "Marketni tanlang:");
                message1.setReplyMarkup(InlineBoards.market());
                BOT.executeMessage(message1);
                BOT.userState.put(chatID, State.REGISTERED.getName());
            }
        }
    }
}

