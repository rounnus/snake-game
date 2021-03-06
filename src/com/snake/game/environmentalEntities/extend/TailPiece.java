package com.snake.game.environmentalEntities.extend;

import com.snake.game.constants.ComponentColors;
import com.snake.game.constants.ComponentDimensions;
import com.snake.game.environmentalEntities.EnvironmentalEntityDetails;
import javafx.scene.shape.Rectangle;

import java.awt.Point;
import java.awt.Dimension;

public class TailPiece extends EnvironmentalEntityDetails {

    private static int pieceIndex = 0;
    private int tailIndex;
    private Point previousPoint;
    private final boolean head;

    public TailPiece(Point point, boolean head) {
        this.entityPoint = new Point(point.x, point.y);
        this.entityDimension = new Dimension(ComponentDimensions.TAIL_PIECE_WIDTH.size, ComponentDimensions.TAIL_PIECE_HEIGHT.size);
        this.entityShape = new Rectangle(entityDimension.width, entityDimension.height);
        this.entityShape.setX(entityPoint.getX());
        this.entityShape.setY(entityPoint.getY());
        this.entityShape.setFill(ComponentColors.TAIL_COLOR.color);
        this.previousPoint = entityPoint;
        this.head = head;
        this.tailIndex = TailPiece.pieceIndex;
        TailPiece.pieceIndex++;
    }

    public void setPreviousPoint(Point previousPoint) {
        this.previousPoint = previousPoint;
    }

    public Point getPreviousPoint() {
        return this.previousPoint;
    }

    public int getTailIndex() {
        return this.tailIndex;
    }
    public boolean isHead() {
        return this.head;
    }
}
