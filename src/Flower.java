import java.util.Arrays;

public class Flower {
    String name;
    int price;
    String color;

    public void getMaxPrice(Flower[] flowers){
        int expensive = flowers[0].price;
        for (int i = 0;i< flowers.length;i++) {
            expensive = Math.max(expensive,flowers[i].price);
        }
        System.out.println("Expensive flower is: "+expensive);
    }
    public String getArrayFlower(Flower[] flowers){
        String[] newArray1 = new String[flowers.length];
        String[] newArray2 = new String[flowers.length];
        int[] newArray3 = new int[flowers.length];
        for (int i = 0;i< flowers.length;i++) {
            newArray1[i] = flowers[i].name;
            newArray2[i] = flowers[i].color;
            newArray3[i] = flowers[i].price;
        }
        return Arrays.toString(newArray1)+"\n"+Arrays.toString(newArray2)+"\n"+Arrays.toString(newArray3);
    }
}
