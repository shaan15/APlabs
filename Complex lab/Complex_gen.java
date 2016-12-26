import java.util.*;
import java.lang.*;

public class Complex_gen<T extends Number>{
	private final T real;
	private final T imag;
	Complex_gen(T real, T imag){
		this.imag = imag;
		this.real = real;

	}
	T getReal(){
		return this.real;
	}
	T getImag(){
		return this.imag;
	}
	public Complex_gen<T> addition(Complex_gen<T> c){
		if((this.real instanceof Integer) && (this.imag instanceof Integer) && (c.getReal() instanceof Integer) && (c.getImag() instanceof Integer)){
			return new Complex_gen((Integer)this.real + (Integer)c.getReal(), (Integer)this.imag + (Integer)c.getImag());
		}
		
		else if((this.real instanceof Float) && (this.imag instanceof Float) && (c.getReal() instanceof Float) && (c.getImag() instanceof Float)){
			return new Complex_gen((Float)this.real + (Float)c.getReal(), (Float)this.imag + (Float)c.getImag());
		}
		else{
			return new Complex_gen((Double)this.real + (Double)c.getReal(), (Double)this.imag + (Double)c.getImag());
		}

	}
	
	public Complex_gen<T> subtraction(Complex_gen<T> c){
		//return new Complex_gen<T>();
		if((this.real instanceof Integer) && (this.imag instanceof Integer) && (c.getReal() instanceof Integer) && (c.getImag() instanceof Integer)){
			return new Complex_gen((Integer)this.real - (Integer)c.getReal(), (Integer)this.imag - (Integer)c.getImag());
		}
		
		else if((this.real instanceof Float) && (this.imag instanceof Float) && (c.getReal() instanceof Float) && (c.getImag() instanceof Float)){
			return new Complex_gen((Float)this.real - (Float)c.getReal(), (Float)this.imag - (Float)c.getImag());
		}
		else{
			return new Complex_gen((Double)this.real - (Double)c.getReal(), (Double)this.imag - (Double)c.getImag());
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

	public Complex_gen<T> getConjugate(){
		if((this.real instanceof Integer) && (this.imag instanceof Integer)){
			return new Complex_gen((Integer)this.real,(Integer.valueOf(0))-(Integer)this.imag);
		}
		else if((this.real instanceof Float) && (this.imag instanceof Float)){
			return new Complex_gen((Float)this.real,(Float.valueOf(0))-(Float)this.imag);
		}
		else{
			return new Complex_gen((Double)this.real,(Double.valueOf(0))-(Double)this.imag);
		}		

	}
	
	public Complex_gen<T> multiply(Complex_gen<T> c){
		if((this.real instanceof Integer) && (this.imag instanceof Integer) && (c.getReal() instanceof Integer) && (c.getImag() instanceof Integer)){
			return new Complex_gen((Integer)this.real*(Integer)c.getReal() - (Integer)this.imag*(Integer)c.getImag(),(Integer)this.real*(Integer)c.getImag() + (Integer)c.getReal()*(Integer)this.imag);
		}
		
		else if((this.real instanceof Float) && (this.imag instanceof Float) && (c.getReal() instanceof Float) && (c.getImag() instanceof Float)){
			return new Complex_gen((Float)this.real*(Float)c.getReal() - (Float)this.imag*(Float)c.getImag(),(Float)this.real*(Float)c.getImag() + (Float)c.getReal()*(Float)this.imag);
		}
		else{
			return new Complex_gen((Double)this.real*(Double)c.getReal() - (Double)this.imag*(Double)c.getImag(),(Double)this.real*(Double)c.getImag() + (Double)c.getReal()*(Double)this.imag);
		}
	}
	
	public String toString(){
		return this.real+ " + " +this.imag+"i";
	}
}