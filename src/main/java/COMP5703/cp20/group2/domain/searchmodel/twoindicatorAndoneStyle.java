package COMP5703.cp20.group2.domain.searchmodel;

public class twoindicatorAndoneStyle {
	
	private String element;
	private Double number1;
	private Double number2;
	private String style;
	
	
	public twoindicatorAndoneStyle(String element, Double number1, Double number2, String style) {
		super();
		this.element = element;
		this.number1 = number1;
		this.number2 = number2;
		this.style = style;
	}
	
	
	public String getElement() {
		return element;
	}
	public void setElement(String element) {
		this.element = element;
	}
	public Double getNumber1() {
		return number1;
	}
	public void setNumber1(Double number1) {
		this.number1 = number1;
	}
	public Double getNumber2() {
		return number2;
	}
	public void setNumber2(Double number2) {
		this.number2 = number2;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	
	

}
