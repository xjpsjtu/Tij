package Ch16.trashvisitor;
//:Visitable.java
//An interface to add visitor functionality to the Trash hierarchy without modifying the base class
import Ch16.trash.*;
interface Visitable {
	//The new method:
	void accept(Visitor v);
}
