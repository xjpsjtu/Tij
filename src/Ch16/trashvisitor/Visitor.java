package Ch16.trashvisitor;
//:Visitor.java
//The base interface for visitors
import Ch16.trash.*;
public class Visitor {
	void visit(VAluminum a){};
	void visit(VPaper a){};
	void visit(VGlass a){};
	void visit(VCardboard a){};
}
