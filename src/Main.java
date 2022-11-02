public class Main {
    public static void main(String[] args) {

        // Task N%5. Бир Flower деген класс тузунуз. Анын поляларын жазыныз аты, баасы жана тусу болот. (Роза и Тюльпан)
        // 2 методу болот эн кымбат гулду чыгаруучу жана аралаш гулдорду аты менен жаны массивге салуучу метод болсун.
        // Аларды Main ден чыгарып корунуз.

        Flower flower1 = new Flower();
        flower1.name = "Rose";
        flower1.price = 200;
        flower1.color = "Red";

        Flower flower2 = new Flower();
        flower2.name = "Aigul";
        flower2.price = 500;
        flower2.color = "Red";

        Flower flower3 = new Flower();
        flower3.name = "Tulpan";
        flower3.price = 350;
        flower3.color = "Yellow";

        Flower flower4 = new Flower();
        flower4.name = "Baichechekei";
        flower4.price = 150;
        flower4.color = "White";

        Flower[] flowers = {flower1,flower2,flower3,flower4};
        flower1.getMaxPrice(flowers);

        System.out.println(flower1.getArrayFlower(flowers));

    }
}