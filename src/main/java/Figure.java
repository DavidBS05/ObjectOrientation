public abstract class Figure {
    private String paint;
    private String figures;
    private String type;
    private Double degrees;

    public String getPaint() { return paint;  }
    public void setPaint(String paint) { this.paint = paint; }

    public String getFigures() { return figures; }
    public void setFigures(String figures) { this.figures = figures; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public Double getDegrees() { return degrees; }
    public void setDegrees(Double degrees) { this.degrees = degrees; }
}
