
//    # указываем обработчики логов - файловый и консольный
//    handlers = java.util.logging.FileHandler, java.util.logging.ConsoleHandler
//# все логи уровня инфо и выше
//    java.util.logging.FileHandler.level     = INFO
//# класс который отвечает за форматирование логов в файл
//    java.util.logging.FileHandler.formatter = java.util.logging.SimpleFormatter
//# append    = true чтобы шла дозапись файла
//    java.util.logging.FileHandler.append    = true
//            # паттерн для создания строки в нужном формате
//    java.util.logging.FileHandler.pattern   = log.%u.%g.txt
//# с какого уровня будем выводить сообщения в консоль
//    java.util.logging.ConsoleHandler.level     = INFO
//# класс который отвечает за форматирование логов в консоль
//    java.util.logging.ConsoleHandler.formatter = java.util.logging.SimpleFormatter



package patterns.behavioral.strategy.solution.Logger;

import java.io.FileInputStream;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Log {
    static {
        try(FileInputStream in = new FileInputStream("log.config")){
            LogManager.getLogManager().readConfiguration(in);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static Logger log(String className) {
        return Logger.getLogger(className);
    }
}