package uz.pdp.market.telegram.buttons;

import org.springframework.beans.factory.annotation.Autowired;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboard;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import uz.pdp.market.dto.market.MarketDto;
import uz.pdp.market.service.market.MarketService;
import uz.pdp.market.telegram.emojis.Emojis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class InlineBoards {

    private static final InlineKeyboardMarkup board = new InlineKeyboardMarkup();
    private static MarketService marketService;


    public static ReplyKeyboard market() {

        List<MarketDto> marketDtos = Objects.requireNonNull(marketService.getAll().getBody()).getData();
        ArrayList<InlineKeyboardButton> inlineBoards = new ArrayList<>();


        for (MarketDto marketDto : marketDtos) {
            InlineKeyboardButton button = new InlineKeyboardButton(marketDto.getName());
            button.setCallbackData(marketDto.getName());
            inlineBoards.add(button);
        }
//        InlineKeyboardButton academic = new InlineKeyboardButton(Emojis.ACADEMIC + "Academic");
//        academic.setCallbackData("academic");
//
//        InlineKeyboardButton marketing = new InlineKeyboardButton(Emojis.MARKETING + "Marketing");
//        marketing.setCallbackData("marketing");
//
//        InlineKeyboardButton economic = new InlineKeyboardButton(Emojis.ECONOMIC + "Economic");
//        economic.setCallbackData("economic");

//        board.setKeyboard(Arrays.asList(getRow(academic), getRow(marketing), getRow(economic)));
        return board;
    }

    private static List<InlineKeyboardButton> getRow(InlineKeyboardButton... buttons) {
        return Arrays.stream(buttons).toList();
    }

    public static ReplyKeyboard position() {
        InlineKeyboardButton teacher = new InlineKeyboardButton(Emojis.ACADEMIC + "Teacher");
        teacher.setCallbackData("teacher");

        InlineKeyboardButton administrator = new InlineKeyboardButton(Emojis.MARKETING + "Administrator");
        administrator.setCallbackData("administrator");

        InlineKeyboardButton employee = new InlineKeyboardButton(Emojis.ECONOMIC + "Employee");
        employee.setCallbackData("employee");

        InlineKeyboardButton headDepartment = new InlineKeyboardButton(Emojis.ECONOMIC + "Head Department");
        headDepartment.setCallbackData("headDepartment");

        board.setKeyboard(Arrays.asList(getRow(teacher), getRow(administrator), getRow(employee), getRow(headDepartment)));
        return board;
    }


}