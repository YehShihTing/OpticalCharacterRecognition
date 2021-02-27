import java.io.File;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class TesseractTest {

	public static void main(String[] args) throws TesseractException {
		ITesseract instance = new Tesseract();
        instance.setDatapath("D:\\YST\\Tesseract-OCR\\tessdata");

        File imgDir = new File("C:\\Users\\HJH\\Desktop\\receipt.png");
        long startTime = System.currentTimeMillis();
        String ocrResult = instance.doOCR(imgDir);

        System.out.println("OCR Result: \n" + ocrResult + "\n take time¡G" + (System.currentTimeMillis() - startTime) + "ms");
	}
}
