import java.util.ArrayList;
import java.util.List;

public class HotDrinkVendingMachine extends BottleOfWaterVendingMachine {

    public Product getProduct(String name, int volume, int temperature){
        for (Product item : productList)
            if(item.getName().equals(name) &&
                    ((HotDrink) item).getVolume() == volume &&
                    ((HotDrink) item).getTemperature() == temperature)
                return item;
        return null;
    }
}
