package lab8;
import java.util.Scanner;
public class Poly {
	
	static class node{
		int coeff;
		int exp;
		node left;
		node right;
		node(int coeff,int exp){
			this.coeff=coeff;
			this.exp=exp;
			this.left=null;
			this.right=null;
		}
		
	}
	node head;
	
	Poly(){
		this.head=null;
	}
	
	public Poly insert(int c, int exp) {
		if(this.head==null) {
			node n =new node(c,exp);
			this.head=n;
			return this;
		}
		else {
			node n=new node(c,exp);
			n.right=this.head;
			this.head.left=n;
			n.left=null;
			this.head=n;
			return this;
		}
	}
	
	public void print() {
		node ele=this.head;
		while(ele!=null) {
			System.out.print(ele.coeff+"x^"+ele.exp+" ");
			ele=ele.right;
			if(ele != null) {
				System.out.print("+ ");	
			}
		}
		System.out.println();
	}
	
	public int size() {
		if(this.head==null) {
			return 0;
			
		}
		else {
			node curr=this.head;
			int s=0;
			while(curr!=null) {
				s++;
				curr=curr.right;
			}
			return s;
			
		}
	}
	
	public Poly mul(Poly list) {
		 if(this.size()==0 && list.size()!=0) {
			 return list;
		 }
		 else if(this.size()!=0 && list.size()==0) {
			 return this;
		 }
		 else {
			 Poly n=new Poly();
			 node curr1=this.head;
			 while(curr1!=null) {
				 
				 node curr2=list.head;
				 while(curr2!=null) {
					 
					 int exp=curr2.exp+curr1.exp;
					 int coeff=curr1.coeff*curr2.coeff;
					 n.insert(coeff, exp);
					 curr2=curr2.right;
					 
				 }
				 curr1=curr1.right;
			 }
			 
			 node curr=n.head;
			 while(curr!=null) {
				 node eCur=curr.right;
				 while(eCur!=null) {
					 if(eCur.exp==curr.exp) {
						 curr.coeff=curr.coeff+eCur.coeff;
						 if(eCur.right!=null) {
							 
							 eCur.left.right=eCur.right;
							 eCur.right.left=eCur.left;
							 eCur=eCur.right;
						 
						 }
						 else {
							 eCur.left.right=null;
							 eCur=null;
						 }
					 }
					 else {
						 eCur=eCur.right;
					 }
				}
				curr=curr.right; 
			 }
			 return n;
		 }
	}
	

	public static void main(String[] args) {
		Poly p1=new Poly();
		Poly p2=new Poly();

		Scanner sc=new Scanner(System.in);
		System.out.print("Number of Elements in First Polynomial : ");
		int ln=sc.nextInt();
		for(int i=0;i<ln;i++) {
			System.out.print("E"+(i+1) + " Coeff :");
			int c=sc.nextInt();
			System.out.print("E"+(i+1) + " Exp :");
			int e=sc.nextInt();
			p1.insert(c, e);
		}
		p1.print();
		System.out.println();
		
		System.out.print("Number of Elements in Second Polynomial : ");
		int sn=sc.nextInt();
		for(int i=0;i<sn;i++) {
			System.out.print("E"+(i+1) + " Coeff :");
			int c=sc.nextInt();
			System.out.print("E"+(i+1) + " Exp :");
			int e=sc.nextInt();
			p2.insert(c, e);
		}
		p2.print();
		System.out.println();
		
		System.out.print("Product of Polynomials = ");
		p1.mul(p2).print();
		
	
		
	}

}
