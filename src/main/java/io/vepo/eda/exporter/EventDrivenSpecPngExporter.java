package io.vepo.eda.exporter;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import io.vepo.eda.geometry.SpecGeometryAnalyzer;
import io.vepo.eda.model.EventDrivenSpec;

public class EventDrivenSpecPngExporter implements EventDrivenSpecExporter {

    @Override
    public void export(EventDrivenSpec spec, File outputFile) {
        SpecGeometryAnalyzer analyser = new SpecGeometryAnalyzer();
analyser.generate(spec);
        int width = 1024;
        int height = 512;
        System.out.println("Exporting: " + spec);
        BufferedImage canvas = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D g = (Graphics2D) canvas.getGraphics();
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, width, height);

        g.setColor(Color.BLUE);
        g.drawArc(width / 2, height / 2, 200, 200, 0, 360);
        g.fillArc(width / 2, height / 2, 200, 200, 0, 360);
        try {
            ImageIO.write(canvas, "png", outputFile);
        } catch (IOException e) {
            System.err.println("Could not write on file: " + outputFile.getAbsolutePath());
            System.exit(-1);
        }
    }

    @Override
    public String extension() {
        return "png";
    }
}
