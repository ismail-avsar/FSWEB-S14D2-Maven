import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {

        Bedroom bedroom = new Bedroom(
                "Master Bedroom",
                new Wall("North"),
                new Wall("South"),
                new Wall("East"),
                new Wall("West"),
                new Ceiling(250, PaintColor.WHITE),
                new Bed("Modern", 2, 60, 1, 1),
                new Lamp(LampType.NEON, true, 5),
                new Wardrobe(200, 220, 85.5),
                new Carpet(300, 200, PaintColor.GREEN)
        );

        bedroom.getLamp().turnOn();
        bedroom.getBed().make();
        bedroom.getCarpet().lying();
        bedroom.getWardrobe().add();
    }
}
