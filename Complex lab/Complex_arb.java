import java.util.*;
import java.lang.*;

public final class Complex_arb{
	private final Object real;
	private final Object imag;
	Complex_arb(Object real, Object imag){
		this.imag = imag;
		this.real = real;

	}
	Object getReal(){
		return this.real;
	}
	Object getImag(){
		return this.imag;
	}
	public Complex_arb addition(Complex_arb c){
		if((this.real instanceof Integer) && (this.imag instanceof Integer) && (c.getReal() instanceof Integer) && (c.getImag() instanceof Integer)){
			return new Complex_arb((Integer)this.real + (Integer)c.getReal(), (Integer)this.imag + (Integer)c.getImag());
		}
		
		else if((this.real instanceof Float) && (this.imag instanceof Float) && (c.getReal() instanceof Float) && (c.getImag() instanceof Float)){
			return new Complex_arb((Float)this.real + (Float)c.getReal(), (Float)this.imag + (Float)c.getImag());
		}
		else{
			return new Complex_arb((Double)this.real + (Double)c.getReal(), (Double)this.imag + (Double)c.getImag());
		}

	}
	
	public Complex_arb subtraction(Complex_arb c){
		//return new Complex_arb();
		if((this.real instanceof Integer) && (this.imag instanceof Integer) && (c.getReal() instanceof Integer) && (c.getImag() instanceof Integer)){
			return new Complex_arb((Integer)this.real - (Integer)c.getReal(), (Integer)this.imag - (Integer)c.getImag());
		}
		
		else if((this.real instanceof Float) && (this.imag instanceof Float) && (c.getReal() instanceof Float) && (c.getImag() instanceof Float)){
			return new Complex_arb((Float)this.real - (Float)c.getReal(), (Float)this.imag - (Float)c.getImag());
		}
		else{
			return new Complex_arb((Double)this.real - (Double)c.getReal(), (Double)this.imag - (Double)c.getImag());
		}
	}
	
	double absolute(){
		if(this.real instanceof Integer && this.imag instanceof Integer)
		{
			Integer r = (Integer)this.real;
			Integer i = (Integer)this.imag;
			return Math.sqrt(r*r + i*i);
		}
		else if(this.real instanceof Float && this.imag instanceof Float)
		{
			Float r = (Float)this.real;
			Float i = (Float)this.imag;
			return Math.sqrt(r*r + i*i);
		}
		else if(this.real instanceof Double && this.imag instanceof Double)
		{
			Double r = (Double)this.real;
			Double i = (Double)this.imag;
			return Math.sqrt(r*r + i*i);
		}
		else
		{
			return 0.0;
		}
	}
	public Complex_arb getConjugate(){
		//return new Complex_arb(this.real(),0-this.imag());
		if((this.real instanceof Integer) && (this.imag instanceof Integer)){
			return new Complex_arb((Integer)this.real,(Integer.valueOf(0))-(Integer)this.imag);
		}
		
		else if((this.real instanceof Float) && (this.imag instanceof Float)){
			return new Complex_arb((Float)this.real,(Float.valueOf(0))-(Float)this.imag);
		}
		else{
			return new Complex_arb((Double)this.real,(Double.valueOf(0))-(Double)this.imag);
		}		

	}
	
	public Complex_arb multiply(Complex_arb c){
		//return new Complex_arb(this.real*c.getReal() - this.imag*c.getImag(),this.real*c.getImag() + c.getReal()*this.imag);
		if((this.real instanceof Integer) && (this.imag instanceof Integer) && (c.getReal() instanceof Integer) && (c.getImag() instanceof Integer)){
			return new Complex_arb((Integer)this.real*(Integer)c.getReal() - (Integer)this.imag*(Integer)c.getImag(),(Integer)this.real*(Integer)c.getImag() + (Integer)c.getReal()*(Integer)this.imag);
		}
		
		else if((this.real instanceof Float) && (this.imag instanceof Float) && (c.getReal() instanceof Float) && (c.getImag() instanceof Float)){
			return new Complex_arb((Float)this.real*(Float)c.getReal() - (Float)this.imag*(Float)c.getImag(),(Float)this.real*(Float)c.getImag() + (Float)c.getReal()*(Float)this.imag);
		}
		else{
			return new Complex_arb((Double)this.real*(Double)c.getReal() - (Double)this.imag*(Double)c.getImag(),(Double)this.real*(Double)c.getImag() + (Double)c.getReal()*(Double)this.imag);
		}
	}
	
	/*void display(Object r, Object i){
		System.out.println(r"+"i"i");
	}*/
	public String toString(){
		return this.real+ " + " +this.imag+"i";
	}
}