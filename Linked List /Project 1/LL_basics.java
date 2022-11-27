// require certain level of OOPS but not that hard to umderstand yay
import java.util.Scanner;
public class Main {
	/* implemation
	LL() ->
	node{
		int val;
		node next;
		node(val);
		node(val,next);
		methods->
		display();
		insertathead;
	}
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LL list = new LL();
		System.out.println("Intially size " + list.size);
		for (int i = 0; i < 7; i++) {
			int val = sc.nextInt();
			list.insertatlast(val);
		}
		list.insertp(100, 4);
		list.display();
		System.out.println("Size now " + list.size);

//delete
		int val = 	list.deletehead();
		System.out.println(val);
		list.display();
		System.out.println("Size now " + list.size);
//
		int valu = list.deletelast();
		System.out.println(valu);
		list.display();
		System.out.println("Size now " + list.size);
//
		System.out.println("enter index   ");
		int index = sc.nextInt();
		int valueee = list.deleteindex(index);
		System.out.println(valueee);
		list.display();
		System.out.println("Size now " + list.size);

	}


	// implemeted leest choriya di context tere ma ki chut
	public static class LL {
		// initial and final constructor
		private node head;
		private node tail;
		private int size;
		public LL() {
			this.size = 0;
		}
		// insert head
		public void insertathead(int value) {
			node nod = new node(value);
			nod.next = head;
			head = nod;
			if (tail == null) {
				tail = head;
			}
			size++;
		}
		//insert last
		public void insertatlast(int value) {
			if (tail == null) {
				insertathead(value);
				return;
			}
			node nod = new node(value);
			tail.next = nod;
			tail = nod;
			size++;
		}
		//insert at index
		public void insertp(int value, int index) {
			if (index == 0) {
				insertathead(value);
				return;
			}
			if (index == size) {
				insertatlast(value);
				return;
			}
			node temp = head;
			for (int i = 1; i < index; i++) {
				temp = temp.next;
			}
			node nod = new node(value, temp.next);
			temp.next = nod;
			size++;
		}
		//display or traversal
		public void display() {
			node temp = head;
			while (temp != null) {
				System.out.print(temp.val + " ");
				temp = temp.next;
			}
			System.out.println();
		}
		// delete first last index
		public int  deletehead() {
			int val = head.val;
			head = head.next;
			if (head == null) tail = null;
			size--;
			return val;
		}
		public int deletelast() {
			//
			if (size <= 1) {
				deletehead();
			}
			node nod = get(size - 2);
			int value = tail.val;
			tail = nod;
			nod.next = null;
			return value;
		}
		// get method useful
		public node get(int index) {
			node temp = head;
			for (int i = 1; i <= index; i++) {
				temp = temp.next;
			}
			return temp;
		}
		public int deleteindex(int index) {
		// delete position element
			if (index == 0) deletehead();
			if (index == size) deletelast();
			node nod = get(index - 2);
			node nod2 = get(index - 1);
			int value = nod2.val;
			nod.next = nod2.next;
			nod2.next=null;
			size--;
			return value;
		}

		// constructor zone
		//linked list node
		private class node {
			private int val;
			private node next;
			//constructor
			// null constructor
			public node(int value) {
				this.val = value;
			}
			// next constructor
			public node(int value, node next) {
				this.val = value;
				this.next = next;
			}
		}
	}
}