/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author liont
 */
abstract class FiguraGeometrica {
        public abstract Double CalcularP();
	public abstract Double CalcularA();
}

class Circulo extends FiguraGeometrica {
	Double radio;
	public Circulo(Double r){
		radio = r;
	}
	public Double CalcularA(){
		return (Math.PI * Math.pow(radio, 2));
	}

	public Double CalcularP(){
		return 2*Math.PI*radio;
	}
}

class Rectangulo extends FiguraGeometrica {
	Double base;
	Double altura;
	public Rectangulo(double b, double h){
		base = b;
		altura = h;
	}

	public Double CalcularA(){
		return (base * altura);
	}

	public Double CalcularP(){
		return (2*base + 2*altura);
	}
}

class Cuadrado extends FiguraGeometrica {
	Double lado;
	public Cuadrado(Double l){
		lado = l;
	}
	public Double CalcularA(){
		return (Math.pow(lado,2));
	}

	public Double CalcularP(){
		return 4*lado;
	}
}

class Triangulo extends FiguraGeometrica {
	Double base;
	Double altura;
	public Triangulo(Double b, Double h){
		base = b;
		altura = h;
	}

	public Double CalcularA(){
		return (0.5*base*altura);
	}

	public Double CalcularP(){
		return (base + altura + calcularHipotenusa());
	}

	public Double calcularHipotenusa(){
		return Math.sqrt(Math.pow(base,2) + Math.pow(altura, 2));
	}

	public String calcularTipodeTriangulo(){
                double  a = altura;
                double  b = base;
                
                if ((a == b) && (b == calcularHipotenusa())){
			return("Equilatero");
		}

		else if ((b != a) && (b != calcularHipotenusa())){
			return("Escaleno");
		}

		else{
			return("Isosceles");
		}
	}
}

class Rombo extends FiguraGeometrica {
	Double lado;
	Double diagonalMenor;
	Double diagonalMayor;

		public Rombo(Double l, Double dMen, Double dMay){
                lado = l;
		diagonalMenor = dMen;
		diagonalMayor = dMay;
	}
	
	public Double CalcularA(){
		return ((diagonalMayor*diagonalMenor)/2);
	}

	public Double CalcularP(){
		return (lado * 4);
	}
}

class Trapecio extends FiguraGeometrica {
	Double baseMenor;
	Double baseMayor;
	Double lado;
	Double altura;

	public Trapecio(Double BaMen, Double BaMay, Double l, Double h){
		baseMenor = BaMen;
		baseMayor = BaMay;
		lado = l;
		altura = h;
	}
	
	public Double CalcularA(){
		return (((baseMenor + baseMayor)*altura)/2);
	}

	public Double CalcularP(){
		return (baseMenor + baseMayor + lado * 2);
	}
}