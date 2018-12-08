package level16.lesson12.bonus01;

import level16.lesson12.bonus01.common.*;

public class ImageReaderFactory {
    public static ImageReader getReader(ImageTypes types) {
        if (types == ImageTypes.JPG) {
            return new JpgReader();
        } else if (types == ImageTypes.BMP) {
            return new BmpReader();
        } else if (types == ImageTypes.PNG) {
            return new PngReader();
        } else {
            throw new IllegalArgumentException("Неизвестный тип картинки");
        }
    }
}
