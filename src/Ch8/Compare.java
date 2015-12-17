package Ch8;
//:Compare.java
//Interface for sorting callback:

interface Compare {
	boolean lessThan(Object lhs, Object rhs);
	boolean lessThanOrEqual(Object lhs, Object rhs);
}///:~
