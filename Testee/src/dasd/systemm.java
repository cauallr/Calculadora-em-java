package dasd;

import java.util.Scanner;

public class systemm {
	
	public static void main(String[] args){
		classecalc.main(args);
		Scanner leitor = new Scanner(System.in);
		System.out.println("primeiro número:");
		double x = Double.parseDouble(leitor.nextLine());
		System.out.println("segundo numero:");
		double v = Double.parseDouble(leitor.nextLine());
		
		boolean continuar = true;
		
		while(continuar) {
			
			System.out.println("adicionar mais algum número?\n 1- sim\n 2- não");
			double esc1 = Double.parseDouble(leitor.nextLine());
		
		if(esc1 == 2) {
			
			continuar = false;
		}
			
		else if(esc1 == 1) {
			
				System.out.println("qual número?");
				double z = Double.parseDouble(leitor.nextLine());
				x = calcular(x,z);	
		}
				}
		
		System.out.println("selecione a equação desejada:\n 1- Adição\n 2- Subtração\n 3- Multiplicação\n 4- Divisão");
		int esc = Integer.parseInt(leitor.nextLine());
		
		
        switch (esc) {
        case 1:
        	System.out.println("\nResultado:");
        	System.out.println(soma(v,x));
        	break;
        case 2:
        	System.out.println("\nResultado:");
        	System.out.println(menos(v,x));
        	break;
        case 3:
        	System.out.println("\nResultado:");
        	System.out.println(Mult(v,x));
        	break;
        case 4:
        	if (x==0) {
        		System.out.println("essa operação não existe");
        	} else {
        		System.out.println("\nResultado:");
        		System.out.println(Divisao(v,x));
        	}
        	break;
        	default:
        		System.out.println("nenhuma operação dada");
        		break;
        		
        }
        }
	static double calcular(double x, double y) {
		return soma (x, y);
		}
	static double soma (double x, double y) {
			return x + y;
			}
	static double menos(double x, double y) {
		return x - y;
		}
	static double Mult (double x, double y) {
		return x * y;
		}
	static double Divisao (double x, double y) {
		return x/y;
	}
	}

		
		
	

