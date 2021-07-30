package com.oddyssey.world;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class World {

	public World(String path) {
		try {
			BufferedImage map = ImageIO.read(getClass().getResource(path));
			int[] pixels = new int[map.getWidth() * map.getHeight()];
			map.getRGB(0, 0, map.getWidth(), map.getHeight(), pixels, 0, map.getWidth());
			for (int xx = 0; xx < map.getWidth(); xx++) {

				for (int yy = 0; yy < map.getHeight(); yy++) {
					int pixelAtual = pixels[xx + (yy * map.getWidth())];

					if (pixelAtual == 0xFF000000) {
						//Ch�o
					} else if (pixelAtual == 0xFFFFFFFF) {
						//Parede
					}
				}

			}

		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
