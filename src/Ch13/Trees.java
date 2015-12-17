package Ch13;
//:Trees.java
//Simple Swing tree example. Trees can be made vastly more complex than this
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.*;

//Takes an array of Strings and makes the first element a node and the rest leaves:
class Branch{
	DefaultMutableTreeNode r;
	public Branch(String[] data){
		r = new DefaultMutableTreeNode(data[0]);
		for(int i= 1; i < data.length; i++)
			r.add(new DefaultMutableTreeNode(data[i]));
	}
	public DefaultMutableTreeNode node(){
		return r;
	}
}
public class Trees extends JPanel{
	String[][] data = {
			{"Colors", "Red", "Blue", "Green"},
			{"Flavors", "Tart", "Sweet", "Bland"},
			{"Length", "Short", "Medium", "Long"},
			{"Volume", "High", "Medium", "Low"},
			{"Temperature", "High", "Medium", "Low"},
			{"Intensity", "High", "Medium", "Low"}
	};
	static int i = 0;
	DefaultMutableTreeNode root, child, chosen;
	JTree tree;
	DefaultTreeModel model;
	public Trees(){
		setLayout(new BorderLayout());
		root = new DefaultMutableTreeNode("root");
		tree = new JTree(root);
		//Add it and make it take care of scrolling;
		add(new JScrollPane(tree), BorderLayout.CENTER);
		//Capture the  tree's model:
		model = (DefaultTreeModel)tree.getModel();
		JButton test = new JButton("Press me");
		test.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(i < data.length){
					child = new Branch(data[i++]).node();
					//What's the lat one you clicked?
					chosen = (DefaultMutableTreeNode)tree.getLastSelectedPathComponent();
					if(chosen == null)chosen = root;
					//The model will create the appropriate event. In response, the tree will undate itself:
					model.insertNodeInto(child, chosen, 0);
					//This puts the new node on the currently chosen node.
				}
			}
		});
		test.setBackground(Color.BLUE);
		test.setForeground(Color.WHITE);
		JPanel p = new JPanel();
		p.add(test);
		add(p, BorderLayout.SOUTH);
	}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Show.inFrame(new Trees(), 200, 500);
	}

}
