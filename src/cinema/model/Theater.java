package cinema.model;

public class Theater {
	
	private int id;
	private String name;
	private int rows;
	private int cols;
	
	public Theater(String name, int rows, int cols) {
		super();
		this.name = name;
		this.rows = rows;
		this.cols = cols;
	}
	
	public Theater(int id, String name, int rows, int cols) {
		super();
		this.id = id;
		this.name = name;
		this.rows = rows;
		this.cols = cols;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getRows() {
		return rows;
	}
	public int getCols() {
		return cols;
	}
	

}
