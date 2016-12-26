import java.util.*;
import java.lang.*;

public final class Complex{
	private final int real;
	private final int imag;
	Complex(int real, int imag){
		this.imag = imag;
		this.real = real;

	}
	int getReal(){
		return this.real;
	}
	int getImag(){
		return this.imag;
	}
	public Complex addition(Complex c){
		return new Complex(this.real + c.getReal(), this.imag + c.getImag());
	}
	/*int additionImag(int i1, int i2){
		//int ans1 = r1 + r2;
		int ans2 = i1 + i2;
		return ans2;
	}*/
	public Complex subtraction(Complex c){
		/*int diff1 = r1 - r2;
		//int diff2 = i1 - i2;
		return diff1;*/
		return new Complex(this.real - c.getReal(), this.imag - c.getImag());

	}
	/*int subtractImag(int i1, int i2){
		//int diff1 = r1 - r2;
		int diff2 = i1 - i2;
		return diff2;
	}
*/
	double absolute(){
		int j = this.real*this.real + this.imag*this.imag;
		double abso = Math.sqrt(j);
		return abso;
	}
	public Complex getConjugate(){
		return new Complex(this.real,0-this.imag);
	}
	/*int multiplyReal(int r1, int r2, int i1, int i2){
		int mul_r = (r1*r2) - (i1*i2);
		return mul_r;
	}
	int multiplyImag(int r1, int r2, int i1, int i2){
		int mul_i = (r1*i2) + (r2*i1);
		return mul_i;
	}*/
	public Complex multiply(Complex c){
		return new Complex(this.real*c.getReal() - this.imag*c.getImag(),this.real*c.getImag() + c.getReal()*this.imag);
	}
	
	public String toString(){
		return this.real+ " + " +this.imag+"i";
	}
}