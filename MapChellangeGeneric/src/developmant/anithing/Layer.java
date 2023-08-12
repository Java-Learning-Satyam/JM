package developmant.anithing;
import java.util.ArrayList;
import java.util.List;

public class Layer<T extends Mappble> {
    private List<T> layerElements;

    public Layer(T[] layerElements) {
        this.layerElements = new ArrayList<T>(List.of(layerElements));
    }

    public void renderLayer(){
        for (T elements: layerElements) {
            elements.render();
        }
    }
    public void addElement(T... elements) {
        layerElements.addAll(List.of(elements));
    }
    public void addElements() {}
}
