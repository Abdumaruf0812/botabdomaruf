import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Totiqush extends TelegramLongPollingBot {

    @Override
    public void onUpdateReceived(Update update) {
        String firtname = update.getMessage().getFrom().getFirstName();
        Long chatId = update.getMessage().getChatId();
        String habar = update.getMessage().getText();
        String message = firtname + ": "+ habar+" dep yozdi!!!";
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText(message);

        try {
            execute(sendMessage);
            System.out.println(firtname+" = "+habar);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getBotUsername() {
        return "@toti_qush_bot";
    }

    @Override
    public String getBotToken() {
        return "5358379411:AAHsved78Xjp_TiKb_Z-ACkzRA3lx4s015w";
    }
}
