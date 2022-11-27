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