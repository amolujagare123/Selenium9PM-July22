package ScreenshotsDemo;

import javax.imageio.ImageIO;
import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class WindowScreenshot {

    public static void main(String[] args) {
        try {
            Robot robot = new Robot();

            Rectangle rectangle = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage bufferedImage = robot.createScreenCapture(rectangle);
            File file = new File("screen-capture.png");
            boolean status = ImageIO.write(bufferedImage, "png", file);
            System.out.println("Screen Captured ? " + status + " File Path:- " + file.getAbsolutePath());

        } catch (AWTException | IOException ex) {
            System.err.println(ex);
        }
    }

}
