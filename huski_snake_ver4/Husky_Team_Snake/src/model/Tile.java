package model;

import java.sql.Array;

import javax.imageio.ImageIO;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class Tile {

	
	protected TileType TileType;
	protected BufferedImage image;
	protected int x;
	protected int y;
	
	public TileType getTileType() {
		return TileType;
	}


	public void setTileType(TileType tileType) {
		TileType = tileType;
	}


	public BufferedImage getImage() {
		return image;
	}


	public void setImage(BufferedImage image) {
		this.image = image;
	}


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}

}
	
	
	