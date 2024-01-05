import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String[] wordListOne = {
                "круглосуточный", "трех-звенный", "300000-футовый" , "взаимный" , "обоюдный выигрыш" , "фронтенд" , "на основе web-технологий" ,
                "проникающий" , "умный" , "шесть сигм" , "метод критического пути" , "динамический"
        };

        String[] wordListTwo = {
                "уполномоченный" , "трудный" , "чистый продукт" , "ориентированный" , "центральный" , "распределенный" , "кластеризованный" ,
                "фирменный" , "нестандартный ум" , "позиционированный" , "сетевой" , "сфокусированный" , "использованный с выгодой" , "выровненный" ,
                "нацеленный на" , "общий" , "совметсный" , "ускоренный"
        };

        String[] wordListThree = {
                "процесс" , "пунтк разгрузки" , "выход из положения" , "тип структуры" , "талант" , "подход" , "уровень завоеванного внимания" ,
                "портал" , "портал" , "период времени" , "обзор" , "образец" , "пукт следования"
        };

        // сериализация
        SaveWords saveWords = new SaveWords(wordListOne , wordListTwo , wordListThree);

        FileOutputStream outputStream = new FileOutputStream("src/resource/save.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        objectOutputStream.writeObject(saveWords);
        objectOutputStream.close();

        // десериализация
        FileInputStream fileInputStream = new FileInputStream("src/resource/save.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        SaveWords saveWords1 = (SaveWords) objectInputStream.readObject();

        CreatePhrase phrase = new CreatePhrase(saveWords1.getWordListOne(), saveWords1.getWordListTwo(), saveWords.getWordListThree());

        phrase.generatePhrase();

    }
}